package com.piegottin.carpool_calculator.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Track {
    private String name;
    private double distanceInKm;
    private double pricePerKm;
    private List<Carpool> carpools;
}
