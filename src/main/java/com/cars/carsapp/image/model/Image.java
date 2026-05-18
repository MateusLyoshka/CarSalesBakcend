package com.cars.carsapp.image.model;

import com.cars.carsapp.cars.model.Car;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "order")
@Entity
public class Image implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "car_id")
    Car car;
}
