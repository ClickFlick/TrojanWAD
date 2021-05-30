package com.wad.fils.wadtrojan.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clipBoard")
public class ClipboardController {

    @GetMapping
    public String displayClipboard(){
        return "clipBoard";
    }
}
