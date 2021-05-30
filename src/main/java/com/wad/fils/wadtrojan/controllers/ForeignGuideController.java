package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.BookMuseum;
import com.wad.fils.wadtrojan.domain.User;
import com.wad.fils.wadtrojan.services.BookingService;
import com.wad.fils.wadtrojan.services.LocationService;
import com.wad.fils.wadtrojan.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("foreignGuide")
public class ForeignGuideController {

    private final BookingService bookingService;
    private final LocationService locationService;
    private final UserService userService;

    public ForeignGuideController(BookingService bookingService, LocationService locationService, UserService userService) {
        this.bookingService = bookingService;
        this.locationService = locationService;
        this.userService = userService;
    }

    @GetMapping
    public String displayGuide(Model model){
        model.addAttribute("newBooking", new BookMuseum());
        model.addAttribute("museum", locationService.findAll());

        return "form";
    }

    @PostMapping
    public String saveBooking(BookMuseum museum,
                              @AuthenticationPrincipal User user ){
        museum.setUser(user);
        user.setBooking(museum);


        bookingService.Save(museum);
        userService.saveUpdate(user);
        return "index";
    }

}
