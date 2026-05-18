package com.cars.carsapp.fipe.dtos;

import com.cars.carsapp.fipe.model.Fipe;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class FipeOutDto {
    private UUID id;
    private String fipeCode;
    private String model;
    private String fuel;
    private Integer year;
    private String brand;
    private Long fipePrice;

    public static FipeOutDto toDto(Fipe fipe){
        return FipeOutDto.builder()
                .fipeCode(fipe.getFipeCode())
                .model(fipe.getModel())
                .fuel(fipe.getFuel())
                .year(fipe.getYear())
                .brand(fipe.getBrand())
                .fipePrice(fipe.getFipePrice())
                .id(fipe.getId())
                .build();
    }

    public Fipe toModel(){
        return Fipe.builder()
                .id(this.id)
                .brand(this.brand)
                .model(this.model)
                .fuel(this.fuel)
                .year(this.year)
                .fipePrice(this.fipePrice)
                .fipeCode(this.fipeCode)
                .build();
    }
}
