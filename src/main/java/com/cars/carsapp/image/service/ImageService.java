package com.cars.carsapp.image.service;

import com.cars.carsapp.image.dto.InCreateImageDto;
import com.cars.carsapp.image.repository.ImageRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public Boolean createImage(InCreateImageDto image){
        imageRepository.save(InCreateImageDto.fromDto(image));
        return true;
    }

}
