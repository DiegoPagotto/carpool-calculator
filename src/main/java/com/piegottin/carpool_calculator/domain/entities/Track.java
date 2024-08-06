package com.piegottin.carpool_calculator.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
public class Track {
    @Id
    private UUID uuid;
    private String name;
    private double distanceInKm;
    private double pricePerKm;
    @OneToMany
    private List<Carpool> carpools;
}
