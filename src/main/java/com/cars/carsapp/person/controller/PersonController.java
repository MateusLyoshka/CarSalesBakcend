package com.cars.carsapp.person.controller;

import com.cars.carsapp.person.dto.InCreatePersonDto;
import com.cars.carsapp.person.dto.InUpdatePersonDto;
import com.cars.carsapp.person.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("person")
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public ResponseEntity<Boolean> createPerson(@RequestBody InCreatePersonDto person){
        return ResponseEntity.ok(personService.createPerson(person));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable UUID id){
        return ResponseEntity.ok(personService.deletePerson(id));
    }

    @PatchMapping("{id}")
    public ResponseEntity<Boolean> updatePerson(@PathVariable UUID id, @RequestBody InUpdatePersonDto person){
        return ResponseEntity.ok(personService.updatePerson(id, person));
    }

}
