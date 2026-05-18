package com.cars.carsapp.fipe.controller;

import com.cars.carsapp.fipe.dtos.OutFindDto;
import com.cars.carsapp.fipe.dtos.OutFindByIdDto;
import com.cars.carsapp.fipe.service.FipeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("fipe")
@AllArgsConstructor
public class FipeController {

    private FipeService fipeService;

    @GetMapping("{id}")
    public ResponseEntity<OutFindByIdDto> findById(@PathVariable UUID id){
        return ResponseEntity.ok(fipeService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<OutFindDto>> findByBrand(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String model,
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) String fuel,
            @RequestParam(required = false) Long price){
        return ResponseEntity.ok(fipeService.findFipeFilter(brand, model, year, fuel, price));
    }
}
