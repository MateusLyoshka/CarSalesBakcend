package com.cars.carsapp.cars.repository;

import com.cars.carsapp.cars.model.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {

    Collection<Car> findByDeletedAtIsNull();
}
