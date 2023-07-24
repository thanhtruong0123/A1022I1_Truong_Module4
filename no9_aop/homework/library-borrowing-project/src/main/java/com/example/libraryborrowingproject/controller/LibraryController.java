package com.example.libraryborrowingproject.controller;

import com.example.libraryborrowingproject.model.Book;
import com.example.libraryborrowingproject.service.itf.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/")
    public String getList(Model model) {
        List<Book> bookList = bookService.showList();
        model.addAttribute("bookList", bookList);
        return "/list";
    }
}
