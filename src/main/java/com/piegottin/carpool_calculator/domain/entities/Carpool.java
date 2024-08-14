package com.piegottin.carpool_calculator.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Carpool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private Date date;
    private int numberOfPassengers;
    private double amountPaidByPassenger;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Expense> expenses;

    public double calculateTotalProfit() {
        double totalExpenses = expenses.stream().mapToDouble(Expense::getValue).sum();
        return amountPaidByPassenger * numberOfPassengers - totalExpenses;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
    }
}
