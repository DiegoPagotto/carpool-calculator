package com.piegottin.carpool_calculator.domain.services;

import com.piegottin.carpool_calculator.domain.entities.Expense;
import com.piegottin.carpool_calculator.persistence.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(UUID id) {
        return expenseRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Expense not found with id: " + id));
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense deleteExpense(UUID id) {
        Expense expense = getExpenseById(id);
        expenseRepository.delete(expense);
        return expense;
    }
}
