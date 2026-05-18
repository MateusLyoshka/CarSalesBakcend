package com.cars.carsapp.cars.controller;

import com.cars.carsapp.cars.dto.InCreateCarDto;
import com.cars.carsapp.cars.dto.InUpdateCarDto;
import com.cars.carsapp.cars.dto.OutCreateCarDto;
import com.cars.carsapp.cars.dto.OutFindAllCars;
import com.cars.carsapp.cars.model.Car;
import com.cars.carsapp.cars.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("car")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping("register")
    public ResponseEntity<OutCreateCarDto> createCar(@RequestBody InCreateCarDto body){
        return ResponseEntity.ok(carService.createCar(body));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteCar(@PathVariable UUID id){
        return ResponseEntity.ok(carService.deleteCar(id));
    }

    @PatchMapping("{id}")
    public ResponseEntity<Boolean> updateCar(@RequestBody InUpdateCarDto update, @PathVariable UUID id){
        return ResponseEntity.ok(carService.updateCar(update, id));
    }

    @GetMapping("cars")
    public ResponseEntity<List<OutFindAllCars>> getAllCars(){
        return ResponseEntity.ok(carService.findAllCars());
    }
}
