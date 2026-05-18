package com.cars.carsapp.fipe.model;

import com.cars.carsapp.cars.model.Car;
import com.cars.carsapp.fipe.dtos.OutFindByIdDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "codigo_fipe")
    private String fipeCode;
    @Column(name = "nome_modelo")
    private String model;
    @Column(name = "nome_combustivel")
    private String fuel;
    @Column(name = "ano_modelo")
    private Integer year;
    @Column(name = "nome_marca")
    private String brand;
    @Column(name = "valor_centavos")
    private Long fipePrice;

}
