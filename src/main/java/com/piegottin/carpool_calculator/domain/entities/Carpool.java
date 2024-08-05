package com.piegottin.carpool_calculator.domain.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
public class Carpool {
    private Date date;
    private int numberOfPassengers;
    private double amountPaidByPassenger;
    private List<Expense> expenses;
}
