package com.cars.carsapp.fipe.service;

import com.cars.carsapp.fipe.dtos.OutFindDto;
import com.cars.carsapp.fipe.dtos.OutFindByIdDto;
import com.cars.carsapp.fipe.model.Fipe;
import com.cars.carsapp.fipe.repository.FipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FipeService {

    private final FipeRepository fipeRepository;

    public OutFindByIdDto findById(UUID id){
        return fipeRepository.findById(id)
                .map(OutFindByIdDto::toDto).orElseThrow();
    }

    public List<OutFindDto> findFipeFilter(String brand, String model, Integer year, String fuel, Long price){
        List<Fipe> fipes = fipeRepository.findFipeFilter(brand, model, year, fuel, price);
        if (fipes.isEmpty()) return null;
        return fipes.stream()
                .map(OutFindDto::toDto)
                .toList();
    }
}
