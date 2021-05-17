package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }


    @GetMapping
    public String showLocations(Model model){
        model.addAttribute("museums",locationService.findAll());
        return "Locations";
    }

    @GetMapping("/{id}/show")
    public String showDetails(@PathVariable String id, Model model){
        model.addAttribute("locationInfo", locationService.findById(Long.valueOf(id)));
        return "location/show";
    }
}
