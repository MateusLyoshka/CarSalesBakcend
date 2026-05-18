package com.cars.carsapp.cars.model;

import com.cars.carsapp.fipe.model.Fipe;
import com.cars.carsapp.image.model.Image;
import com.cars.carsapp.person.model.Person;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "price")
    private Long price;

    @Column(name = "description")
    private String description;

    @Column(name = "color")
    private String color;

    @Column(name = "km_driven")
    private Integer kmDriven;

    @Column(name = "deleted_at")
    private Long deletedAt;

    @ManyToOne
    @JoinColumn(name = "fipe_id")
    private Fipe fipeInfo;

    @OneToMany(mappedBy = "car")
    private Set<Image> images;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

}
