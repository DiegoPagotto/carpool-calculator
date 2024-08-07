package com.piegottin.carpool_calculator.domain.services;

import com.piegottin.carpool_calculator.domain.entities.Track;
import com.piegottin.carpool_calculator.persistence.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class TrackService {
    @Autowired
    private TrackRepository trackRepository;

    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    public Track getTrackById(UUID id) {
        return trackRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Track not found with id: " + id));
    }

    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    public Track deleteTrack(UUID id) {
        Track track = getTrackById(id);
        trackRepository.delete(track);
        return track;
    }
}