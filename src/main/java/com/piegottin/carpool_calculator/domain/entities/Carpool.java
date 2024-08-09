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
}
