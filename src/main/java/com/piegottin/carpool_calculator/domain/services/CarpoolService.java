package com.piegottin.carpool_calculator.domain.services;

import com.piegottin.carpool_calculator.domain.entities.Carpool;
import com.piegottin.carpool_calculator.domain.entities.Expense;
import com.piegottin.carpool_calculator.persistence.repositories.CarpoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class CarpoolService {
    @Autowired
    private CarpoolRepository carpoolRepository;
    @Autowired
    private ExpenseService expenseService;

    public List<Carpool> getAllCarpools() {
        return carpoolRepository.findAll();
    }

    public Carpool getCarpoolById(UUID id) {
        return carpoolRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Carpool not found with id: " + id));
    }

    public Carpool saveCarpool(Carpool carpool) {
        return carpoolRepository.save(carpool);
    }

    public Carpool deleteCarpool(UUID id) {
        Carpool carpool = getCarpoolById(id);
        carpoolRepository.delete(carpool);
        return carpool;
    }

    public double getTotalProfit(UUID id) {
        Carpool carpool = getCarpoolById(id);
        return carpool.calculateTotalProfit();
    }

    public void addExpense(UUID carpoolId, UUID expenseId) {
        Carpool carpool = getCarpoolById(carpoolId);
        Expense expense = expenseService.getExpenseById(expenseId);
        carpool.addExpense(expense);
        carpoolRepository.save(carpool);
    }

    public void removeExpense(UUID carpoolId, UUID expenseId) {
        Carpool carpool = getCarpoolById(carpoolId);
        Expense expense = expenseService.getExpenseById(expenseId);
        carpool.removeExpense(expense);
        carpoolRepository.save(carpool);
    }

}
