package com.cars.carsapp.person.service;

import com.cars.carsapp.cars.dto.InUpdateCarDto;
import com.cars.carsapp.person.dto.InCreatePersonDto;
import com.cars.carsapp.person.dto.InUpdatePersonDto;
import com.cars.carsapp.person.model.Person;
import com.cars.carsapp.person.repository.PersonRepository;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Boolean createPerson(InCreatePersonDto user){
        personRepository.save(InCreatePersonDto.fromDto(user));
        return true;
    }

    public Boolean deletePerson(UUID id){
        Person p = findPersonById(id);
        p.setDeleted_at(System.currentTimeMillis());
        personRepository.save(p);
        return true;
    }

    public Boolean updatePerson(UUID personId, InUpdatePersonDto dto){
        Person p = findPersonById(personId);
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
        try {
            mapper.updateValue(p, InUpdatePersonDto.fromDto(dto));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        personRepository.save(p);
        return true;
    }



    public Person findPersonById(UUID id){
        return personRepository.findById(id).orElseThrow();
    }
}
