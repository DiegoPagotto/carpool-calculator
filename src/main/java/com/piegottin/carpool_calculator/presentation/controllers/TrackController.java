package com.piegottin.carpool_calculator.presentation.controllers;

import com.piegottin.carpool_calculator.domain.entities.Track;
import com.piegottin.carpool_calculator.domain.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/track")
public class TrackController {
    @Autowired
    private TrackService trackService;

    @GetMapping
    public List<Track> getAllTracks() {
        return trackService.getAllTracks();
    }

    @GetMapping("/{id}")
    public Track getTrack(@PathVariable UUID id) {
        return trackService.getTrackById(id);
    }

    @PostMapping
    public Track saveTrack(@RequestBody Track track) {
        return trackService.saveTrack(track);
    }

    @DeleteMapping("/{id}")
    public Track deleteTrack(@PathVariable UUID id) {
        return trackService.deleteTrack(id);
    }

    @PutMapping
    public Track updateTrack(@RequestBody Track track) {
        return trackService.saveTrack(track);
    }
}