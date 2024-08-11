package com.piegottin.carpool_calculator.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String name;
    private double distanceInKm;
    private double pricePerKm;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Carpool> carpools;

    public void addCarpool(Carpool carpool) {
        carpools.add(carpool);
    }
}
