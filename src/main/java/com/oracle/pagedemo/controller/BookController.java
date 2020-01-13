package com.oracle.pagedemo.controller;

import com.oracle.pagedemo.entity.Book;
import com.oracle.pagedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/books")
    public String books(@RequestParam(required = false,defaultValue = "1") Integer page, Model model){
        Map<String, Object> map = bookService.listPage(page, BookService.PAGE_SIZE);
        model.addAttribute("books",map.get("books"));
        Object pageNum = map.get("pageNum");
        System.out.println("pageNum = " + pageNum);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("page",page);
        System.out.println("page = " + page);
        return "books";
    }


}
