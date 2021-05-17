package com.wad.fils.wadtrojan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String defaultBook(){
        return "Book-1";
    }

    @GetMapping("/bookOne")
    public String bookOne(){
        return "Book-1";
    }

    @GetMapping("/bookTwo")
    public String bookTwo(){
        return "Book-2";
    }

    @GetMapping("/bookThree")
    public String bookThree(){
        return "Book-3";
    }


}
