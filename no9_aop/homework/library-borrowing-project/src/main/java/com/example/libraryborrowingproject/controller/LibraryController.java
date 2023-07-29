package com.example.libraryborrowingproject.controller;

import com.example.libraryborrowingproject.model.Book;
import com.example.libraryborrowingproject.model.LoanCard;
import com.example.libraryborrowingproject.service.itf.IBookService;
import com.example.libraryborrowingproject.service.itf.ILoanCardService;
import com.example.libraryborrowingproject.service.itf.IStudentService;
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
    private ILoanCardService loanCardService;
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public String getList(Model model) {
        List<Book> bookList = bookService.showList();
        model.addAttribute("bookList", bookList);
        return "/list";
    }

    @GetMapping("/borrow/{id}")
    public String borrowBook(@PathVariable Long id, Model model) {
        Book borrowBook = bookService.getBookById(id);
        model.addAttribute("borrowBook", borrowBook);
        if (borrowBook.getQuantity() == 0) {
            model.addAttribute("error", "This book is out of stock");
            return "/error";
        }

        model.addAttribute("studentList", studentService.getStudentList());
        model.addAttribute("loanCard", new LoanCard());
        return "/borrow";
    }

    @PostMapping("/borrow/{id}")
    public String borrowBook(@PathVariable Long id, @ModelAttribute("loanCard") LoanCard loanCard, @RequestParam("bookName") String bookName, RedirectAttributes redirectAttributes) {
        //Create Loan Card
        LocalDate currentDate = LocalDate.now();
        loanCard.setLoanDate(currentDate.toString());

        Book book = bookService.getBookByName(bookName);
        loanCard.setBook(book);

        loanCardService.save(loanCard);

        //Decrease quantity book in book shell
        bookService.decreaseBook(id);

        redirectAttributes.addFlashAttribute("mess", "Borrow successfully");
        return "redirect:/library";
    }

    @GetMapping("/loan-card")
    public String showLoanBook(Model model) {
        List<LoanCard> loanCardList = loanCardService.getLoanCardList();
        model.addAttribute("loanCardList", loanCardList);
        return "/loanCard";
    }

    @GetMapping("/return/{id}")
    public String returnBook(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        LoanCard loanCard = loanCardService.getLoanCardById(id);

        // CHỈNH SỬA LẠI LOAN CARD
        LocalDate currentDate = LocalDate.now();
        loanCard.setReturnDate(currentDate.toString());
        loanCard.setStatus(true);
        loanCardService.save(loanCard);

        // CHỈNH LẠI LƯỢNG SÁCH
        Long bookId = loanCard.getBook().getId();
        bookService.increaseBook(bookId);

        //MESS
        redirectAttributes.addFlashAttribute("mess", "Returned book successfully");

        return "redirect:/library/loan-book";
    }
}
