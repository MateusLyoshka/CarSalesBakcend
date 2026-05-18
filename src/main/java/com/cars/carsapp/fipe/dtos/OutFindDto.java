package com.cars.carsapp.fipe.dtos;

import com.cars.carsapp.fipe.model.Fipe;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutFindDto {
    private UUID id;
    private String model;
    private String fuel;
    private Integer year;
    private String brand;
    private Long fipePrice;

    public static OutFindDto toDto(Fipe fipe) {
        return OutFindDto.builder()
                .id(fipe.getId())
                .model(fipe.getModel())
                .fuel(fipe.getFuel())
                .year(fipe.getYear())
                .brand(fipe.getBrand())
                .fipePrice(fipe.getFipePrice())
                .build();
    }
}
