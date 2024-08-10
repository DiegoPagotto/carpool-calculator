package com.piegottin.carpool_calculator.persistence.repositories;

import com.piegottin.carpool_calculator.domain.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<Expense, UUID> {
}
