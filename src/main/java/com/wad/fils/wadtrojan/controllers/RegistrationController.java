package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.User;
import com.wad.fils.wadtrojan.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/register")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUserAdd(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping
    public String saveUser(User user, Model model){
        if(userService.save(user)){
            return "index";
        }else {
            model.addAttribute("errorMSG","Username already exists");
            return "register";
        }

    }

}
