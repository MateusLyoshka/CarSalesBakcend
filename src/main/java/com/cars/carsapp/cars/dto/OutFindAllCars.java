package com.cars.carsapp.cars.dto;

import com.cars.carsapp.cars.model.Car;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class OutFindAllCars {
    private Long price;
    private String description;
    private String color;
    private Integer kmDriven;
    private UUID fipeInfo;
//    private UUID person;

    public static OutFindAllCars toDto(Car car){
        return OutFindAllCars.builder()
                .price(car.getPrice())
                .description(car.getDescription())
                .color(car.getColor())
                .kmDriven(car.getKmDriven())
                .fipeInfo(car.getFipeInfo().getId())
//                .person(car.getPerson().getId())
                .build();
    }
}
