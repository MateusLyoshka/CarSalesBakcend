package com.cars.carsapp.cars.dto;

import com.cars.carsapp.cars.model.Car;
import com.cars.carsapp.fipe.dtos.FipeOutDto;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OutCreateCarDto {
    private Integer kmDriven;
    private String color;
    private Long price;
    private String description;
    private UUID personId;
    private FipeOutDto fipe;

    public static OutCreateCarDto toDto(Car car){
        return OutCreateCarDto.builder()
                .color(car.getColor())
                .price(car.getPrice())
                .description(car.getDescription())
                .kmDriven(car.getKmDriven())
                .personId(car.getPerson().getId())
                .fipe(FipeOutDto.toDto(car.getFipeInfo()))
                .build();
    }

}