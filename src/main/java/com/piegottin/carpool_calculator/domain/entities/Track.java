package com.piegottin.carpool_calculator.domain.entities;

import lombok.Builder;
import java.util.List;

@Builder
public class Track {
    private String name;
    private double distanceInKm;
    private double pricePerKm;
    private List<Carpool> carpools;
}
