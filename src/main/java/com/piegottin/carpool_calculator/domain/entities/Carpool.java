package com.piegottin.carpool_calculator.domain.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
public class Carpool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private Date date;
    private int numberOfPassengers;
    private double amountPaidByPassenger;
    @OneToMany
    private List<Expense> expenses;
}
