package com.piegottin.carpool_calculator.domain.services;

import com.piegottin.carpool_calculator.domain.entities.Carpool;
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
}
