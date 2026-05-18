package com.cars.carsapp.person.dto;

import com.cars.carsapp.person.model.Person;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class InCreatePersonDto {
    private String name;
    private String email;
    private String password;

    public static Person fromDto(InCreatePersonDto dto){
        return Person.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }
}
