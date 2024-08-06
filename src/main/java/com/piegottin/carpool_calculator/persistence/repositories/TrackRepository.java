package com.piegottin.carpool_calculator.persistence.repositories;

import com.piegottin.carpool_calculator.domain.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {
}
