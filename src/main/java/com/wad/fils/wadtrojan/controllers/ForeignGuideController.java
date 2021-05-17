package com.wad.fils.wadtrojan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("foreignGuide")
public class ForeignGuideController {

    @GetMapping
    public String displayGuide(){
        return "foreignGuide";
    }
}
