package com.piegottin.carpool_calculator.presentation.controllers;

import com.piegottin.carpool_calculator.domain.entities.Expense;
import com.piegottin.carpool_calculator.domain.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expense getExpense(@PathVariable UUID id) {
        return expenseService.getExpenseById(id);
    }

    @PostMapping
    public Expense saveExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    @DeleteMapping("/{id}")
    public Expense deleteExpense(@PathVariable UUID id) {
        return expenseService.deleteExpense(id);
    }
    
    @PutMapping
    public Expense updateExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }
}
