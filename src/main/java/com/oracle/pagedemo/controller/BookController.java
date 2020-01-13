package com.oracle.pagedemo.controller;

import com.oracle.pagedemo.entity.Book;
import com.oracle.pagedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    private static final Integer PAGE_SIZE = 4;

    @GetMapping("/books")
    public String books(@RequestParam(required = false,defaultValue = "1") Integer page, Model model){
        List<Book> books = bookService.listPage(page, PAGE_SIZE);
        model.addAttribute("books",books);
        return "books";
    }


}
