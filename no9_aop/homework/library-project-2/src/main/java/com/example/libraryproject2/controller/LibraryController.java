package com.example.libraryproject2.controller;

import com.example.libraryproject2.model.Book;
import com.example.libraryproject2.model.BookCard;
import com.example.libraryproject2.model.Card;
import com.example.libraryproject2.service.itf.IBookCardService;
import com.example.libraryproject2.service.itf.IBookService;
import com.example.libraryproject2.service.itf.ICardService;
import com.example.libraryproject2.service.itf.IStudentService;
import com.example.libraryproject2.untility.RandomCodenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private ICardService cardService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IBookCardService bookCardService;

    @GetMapping("")
    public String getList(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "/list";
    }

    @GetMapping("/borrow-book")
    public String borrowBook(@RequestParam("selectedBookIds") List<Long> selectedBookIds, Model model) {
        List<Book> selectedBooks = bookService.findAllById(selectedBookIds);
        String randomCode = RandomCodenerator.generateRandomCode();

        model.addAttribute("randomCode", randomCode);
        model.addAttribute("selectedBooks", selectedBooks);
        model.addAttribute("studentList", studentService.findALl());
        model.addAttribute("card", new Card());
        return "/borrow";
    }

    @PostMapping("/borrow-book")
    public String borrowBook(@ModelAttribute("card") Card card,
                             @RequestParam("selectedBookIds") List<Long> selectedBookIds,
                             RedirectAttributes redirectAttributes) {
        //SAVE CARD
        LocalDate currentDate = LocalDate.now();
        card.setLoanDate(currentDate.toString());
        cardService.save(card);

        //add id for back-end CARD
        Long cardId = cardService.findMaxId();
        card.setId(cardId);

        for (Long bookId : selectedBookIds) {
            BookCard bookCard = new BookCard();
            Book book = new Book();
            book.setId(bookId);

            //SAVE BOOK-CARD
            bookCard.setBook(book);
            bookCard.setCard(card);
            bookCardService.save(bookCard);

            //DECREASE BOOK'S QUANTITY
            bookService.decreaseBook(bookId);
        }

        redirectAttributes.addFlashAttribute("mess", "Borrowed successfully!");
        return "redirect:/library";
    }

    @GetMapping("/loan-card")
    public String getLoanCard(Model model) {
        model.addAttribute("cardList", cardService.findAll());
        return "/loanCard";
    }

    @GetMapping("/return-book/{cardId}")
    public String returnBook(@PathVariable Long cardId, Model model) {
        Card card = cardService.findById(cardId);
        List<BookCard> bookCardList = bookCardService.getBookCardsByCardId(cardId);
        model.addAttribute("card", card);
        model.addAttribute("bookCardList", bookCardList);
        return "/return";
    }

    @PostMapping("/return-book/{cardId}")
    public String returnBook(@PathVariable Long cardId,
                             @RequestParam("cardCode") String cardCode,
                             @RequestParam("bookIds") List<Long> bookIds,
                             RedirectAttributes redirectAttributes) {
        Card card = cardService.findById(cardId);

        if (!cardCode.equals(card.getCode())) {
            redirectAttributes.addFlashAttribute("mess", "The code you typing is not correct!");
            return "redirect:/library/return-book/{cardId}";
        }

        // UPDATE LOAN CARD
        LocalDate currentDate = LocalDate.now();
        card.setReturnDate(currentDate.toString());
        card.setStatus(true);
        cardService.save(card);

        // INCREASE BOOK'S QUANTITY
        for (Long bookId : bookIds) {
            bookService.increaseBook(bookId);
        }

        redirectAttributes.addFlashAttribute("mess", "Return successfully");
        return "redirect:/library/loan-card";
    }
}
