package com.piegottin.carpool_calculator.persistence.repositories;

import com.piegottin.carpool_calculator.domain.entities.Carpool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarpoolRepository extends JpaRepository<Carpool, UUID> {
}
