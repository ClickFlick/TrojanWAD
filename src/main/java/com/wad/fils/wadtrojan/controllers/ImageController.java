package com.wad.fils.wadtrojan.controllers;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
@Controller
@RequestMapping("/locations")
public class ImageController {

    private final LocationService locationService;

    public ImageController(LocationService locationService) {
        this.locationService = locationService;
    }


    @GetMapping("/{id}/museumImg")
    public void renderImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        Museum museum = locationService.findById(Long.valueOf(id));

        if (museum.getImage() != null) {
            byte[] byteArray =new byte[museum.getImage().length];

            int i =0;
            for(Byte wrappedByte : museum.getImage()){
                byteArray[i++] = wrappedByte;
            }

            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is,response.getOutputStream());
        }

    }
}
