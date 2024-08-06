package com.piegottin.carpool_calculator.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
public class Expense {
    @Id
    private UUID uuid;
    private String description;
    private double value;
}
