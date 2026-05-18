package com.cars.carsapp.image.dto;

import com.cars.carsapp.cars.model.Car;
import com.cars.carsapp.image.model.Image;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InCreateImageDto {
    private String url;
    private UUID carId;

    public static Image fromDto(InCreateImageDto dto){
        return Image.builder()
                .car(Car.builder().id(dto.getCarId()).build())
                .url(dto.getUrl())
                .build();
    }
}
