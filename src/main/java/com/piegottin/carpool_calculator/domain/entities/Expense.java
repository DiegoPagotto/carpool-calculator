package com.piegottin.carpool_calculator.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Expense {
    private String description;
    private double value;
}
