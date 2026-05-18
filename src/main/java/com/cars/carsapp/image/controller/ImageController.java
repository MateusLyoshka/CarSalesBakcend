package com.cars.carsapp.image.controller;

import com.cars.carsapp.image.dto.InCreateImageDto;
import com.cars.carsapp.image.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("order")
public class ImageController {
    private ImageService imageService;

    @PostMapping
    public ResponseEntity<Boolean> createOrder(@RequestBody InCreateImageDto image){
        return ResponseEntity.ok(imageService.createImage(image));
    }
}
