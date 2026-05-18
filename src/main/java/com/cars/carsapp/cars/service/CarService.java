package com.cars.carsapp.cars.service;

import com.cars.carsapp.cars.dto.InCreateCarDto;
import com.cars.carsapp.cars.dto.InUpdateCarDto;
import com.cars.carsapp.cars.dto.OutCreateCarDto;
import com.cars.carsapp.cars.dto.OutFindAllCars;
import com.cars.carsapp.cars.model.Car;
import com.cars.carsapp.cars.repository.CarRepository;
import com.cars.carsapp.fipe.model.Fipe;
import com.cars.carsapp.fipe.service.FipeService;
import com.cars.carsapp.person.model.Person;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarService {

    private CarRepository carRepository;
    private FipeService fipeService;


    public OutCreateCarDto createCar(InCreateCarDto newCar){
        Fipe fipe = fipeService.findById(newCar.getFipeId()).toModel();
        Car car = Car.builder()
                .kmDriven(newCar.getKmDriven())
                .color(newCar.getColor())
                .description(newCar.getDescription())
                .price(newCar.getPrice())
                .person(Person.builder().id(newCar.getPersonId()).build())
                .fipeInfo(fipe)
                .build();
        Car savedCar = carRepository.save(car);
        return OutCreateCarDto.toDto(savedCar);
    }

    public Boolean deleteCar(UUID carId){
        Car deletedCar = findCarById(carId);
        deletedCar.setDeletedAt(System.currentTimeMillis());
        carRepository.save(deletedCar);
        return true;
    }

    public Boolean updateCar(InUpdateCarDto update, UUID carId){
        Car car = findCarById(carId);
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
        try {
            mapper.updateValue(car, InUpdateCarDto.fromDto(update));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        carRepository.save(car);
        return true;
    }

    public List<OutFindAllCars> findAllCars(){
        return carRepository.findByDeletedAtIsNull().stream().map(OutFindAllCars::toDto).toList();
    }

    public Car findCarById(UUID carId){
        return carRepository.findById(carId).orElseThrow();
    }
}
