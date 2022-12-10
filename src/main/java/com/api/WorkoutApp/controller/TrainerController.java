package com.api.WorkoutApp.controller;

import com.api.WorkoutApp.dto.TrainerDto;
import com.api.WorkoutApp.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }


    @GetMapping("/trainers")
    public ResponseEntity<List<TrainerDto>> getTrainers(){
        return new ResponseEntity<>(trainerService.getAllTrainers(), HttpStatus.OK);
    }

    @GetMapping("/trainer/{id}")
    public ResponseEntity<TrainerDto> getATrainer(@PathVariable Long id){
        return ResponseEntity.ok(trainerService.getTrainerById(id));
    }

    @PostMapping("/trainer")
    public ResponseEntity<TrainerDto> createTrainer(@RequestBody TrainerDto dto){
        return new ResponseEntity<>(trainerService.createTrainer(dto), HttpStatus.CREATED);
    }

    @PutMapping("/update/trainer/{id}")
    public ResponseEntity<TrainerDto> updateTrainer(@RequestBody TrainerDto dto, @PathVariable("id") Long id){
        TrainerDto response = trainerService.updateTrainer(dto, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/trainer/{id}")
    public ResponseEntity<String> deleteTrainer(@PathVariable("id") Long id){
        trainerService.deleteTrainer(id);
        return new ResponseEntity<>("Trainer delete", HttpStatus.OK);
    }
}
