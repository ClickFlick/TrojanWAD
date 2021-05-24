package com.wad.fils.wadtrojan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cartMuseum")
public class CartController {

    @GetMapping
    public String displayCart(){
        return "cartMuseum";
    }




}
