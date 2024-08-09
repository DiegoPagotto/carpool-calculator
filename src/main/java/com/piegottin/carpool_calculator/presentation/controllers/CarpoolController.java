package com.piegottin.carpool_calculator.presentation.controllers;

import com.piegottin.carpool_calculator.domain.entities.Carpool;
import com.piegottin.carpool_calculator.domain.services.CarpoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carpool")
public class CarpoolController {
    @Autowired
    private CarpoolService carpoolService;

    @GetMapping
    public List<Carpool> getAllCarpools() {
        return carpoolService.getAllCarpools();
    }

    @GetMapping("/{id}")
    public Carpool getCarpool(@PathVariable UUID id) {
        return carpoolService.getCarpoolById(id);
    }

    @PostMapping
    public Carpool saveCarpool(@RequestBody Carpool carpool) {
        return carpoolService.saveCarpool(carpool);
    }

    @DeleteMapping("/{id}")
    public Carpool deleteCarpool(@PathVariable UUID id) {
        return carpoolService.deleteCarpool(id);
    }

    @PutMapping
    public Carpool updateCarpool(@RequestBody Carpool carpool) {
        return carpoolService.saveCarpool(carpool);
    }
}
