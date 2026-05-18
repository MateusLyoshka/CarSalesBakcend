package com.cars.carsapp.cars.dto;

import com.cars.carsapp.cars.model.Car;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InUpdateCarDto {
    private String color;
    private Integer kmDriven;
    private String description;
    private Long price;

    public static Car fromDto(InUpdateCarDto dto){
        return Car.builder()
                .color(dto.getColor())
                .price(dto.getPrice())
                .kmDriven(dto.getKmDriven())
                .description(dto.getDescription())
                .build();
    }
}
