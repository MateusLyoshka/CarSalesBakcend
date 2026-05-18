package com.cars.carsapp.person.dto;

import com.cars.carsapp.person.model.Person;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InUpdatePersonDto {
    private String name;
    private String email;
    private String password;
    private String image;

    public static Person fromDto(InUpdatePersonDto dto){
        return Person.builder()
                .image(dto.getImage())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .name(dto.getName())
                .build();
    }
}
