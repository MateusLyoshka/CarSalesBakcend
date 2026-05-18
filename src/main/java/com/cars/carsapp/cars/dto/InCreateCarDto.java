package com.cars.carsapp.cars.dto;

import com.cars.carsapp.cars.model.Car;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InCreateCarDto {
    private Integer kmDriven;
    private String color;
    private Long price;
    private String description;
    private UUID personId;
    private UUID fipeId;

    public static InCreateCarDto toDto(Car car){
        return InCreateCarDto.builder()
                .color(car.getColor())
                .price(car.getPrice())
                .description(car.getDescription())
                .kmDriven(car.getKmDriven())
                .personId(car.getId())
                .fipeId(car.getFipeInfo().getId())
                .build();
    }
}
