package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myCart")
public class BookingCartController {

    @GetMapping
    public String showCart(@AuthenticationPrincipal User user,
                           Model model){

        model.addAttribute("cartItems",user.getBooking() );
        return "myCart";
    }
}
