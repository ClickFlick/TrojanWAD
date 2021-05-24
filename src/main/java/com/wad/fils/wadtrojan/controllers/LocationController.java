package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.domain.User;
import com.wad.fils.wadtrojan.services.LocationService;
import com.wad.fils.wadtrojan.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.web.configurers.SecurityContextConfigurer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;
    private final UserService userService;

    public LocationController(LocationService locationService, UserService userService) {
        this.locationService = locationService;
        this.userService = userService;
    }


    @GetMapping
    public String showLocations(Model model){
        model.addAttribute("museums",locationService.findAll());

        return "Locations";
    }


    @PostMapping("/{id}/reserve")
    public String sendLocation(@AuthenticationPrincipal User user , @ModelAttribute Museum museum, Model model, @PathVariable String id){
        Museum museum1 = locationService.findById(Long.valueOf(id));
        System.out.println(museum1 +"post");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        museum1.setCapacity(museum1.getCapacity()-1);

        user.setMuseum(museum1);
        System.out.println(user);
        model.addAttribute("museum", museum1);

        return "/cartMuseum";
    }



    @GetMapping("/{id}/show")
    public String showDetails(@PathVariable String id, Model model){
        model.addAttribute("locationInfo", locationService.findById(Long.valueOf(id)));
        model.addAttribute("museum",locationService.findById(Long.valueOf(id)));

        return "location/show";
    }


}
