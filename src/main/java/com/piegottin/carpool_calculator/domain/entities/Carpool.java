package com.piegottin.carpool_calculator.domain.entities;

import java.util.Date;
import java.util.List;

public class Carpool {
    private Date date;
    private int numberOfPassengers;
    private double amountPaidByPassenger;
    private List<Expense> expenses;
}
