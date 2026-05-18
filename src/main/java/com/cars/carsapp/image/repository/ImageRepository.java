package com.cars.carsapp.image.repository;

import com.cars.carsapp.image.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImageRepository extends JpaRepository<Image, UUID> {
}
