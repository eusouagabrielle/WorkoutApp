package com.api.WorkoutApp.controller;

import com.api.WorkoutApp.dto.AthleteDto;
import com.api.WorkoutApp.dto.TrainerDto;
import com.api.WorkoutApp.service.AthleteService;
import com.api.WorkoutApp.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }


    @GetMapping
    public ResponseEntity<List<TrainerDto>> getTrainers(){
        return new ResponseEntity<>(trainerService.getAllTrainers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainerDto> getATrainer(@PathVariable Long id){
        return ResponseEntity.ok(trainerService.getTrainerById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<TrainerDto> createTrainer(@RequestBody TrainerDto dto){
        return new ResponseEntity<>(trainerService.createTrainer(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainerDto> updateTrainer(@RequestBody TrainerDto dto, @PathVariable("id") Long id){
        TrainerDto response = trainerService.updateTrainer(dto, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTrainer(@PathVariable("id") Long id){
        trainerService.deleteTrainer(id);
        return new ResponseEntity<>("Athlete delete", HttpStatus.OK);
    }
}
