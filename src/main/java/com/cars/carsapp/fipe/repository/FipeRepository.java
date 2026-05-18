package com.cars.carsapp.fipe.repository;

import com.cars.carsapp.fipe.dtos.OutFindDto;
import com.cars.carsapp.fipe.model.Fipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FipeRepository extends JpaRepository<Fipe, UUID> {

    @Query(value = "select f from Fipe f where " +
            "(:brand = f.brand or :brand is null) and " +
            "(:model = f.model or :model is null) and " +
            "(:year = f.year or :year is null) and " +
            "(:fuel = f.fuel or :fuel is null) and " +
            "(:price = f.fipePrice or :price is null) ")
    List<Fipe> findFipeFilter(String brand, String model, Integer year, String fuel, Long price);
}
