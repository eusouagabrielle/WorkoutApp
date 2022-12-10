package com.api.WorkoutApp.controller;


import com.api.WorkoutApp.dto.AthleteDto;
import com.api.WorkoutApp.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AthleteController {

    private final AthleteService athleteService;

    @Autowired
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AthleteDto> getAnAthlete(@PathVariable Long id){
       return ResponseEntity.ok(athleteService.getAthleteById(id));
    }

    @GetMapping("/{trainerId}/athletes")
    public List<AthleteDto> getAthletesByTrainerId(@PathVariable(value = "trainerId") Long id){
        return athleteService.getAthletesByTrainersId(id);
    }

    @PostMapping("/create")
    public ResponseEntity<AthleteDto> createAthlete(@RequestBody AthleteDto dto){
        return new ResponseEntity<>(athleteService.createAthlete(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AthleteDto> updateAthlete(@RequestBody AthleteDto dto, @PathVariable("id") Long id){
        AthleteDto response = athleteService.updateAthlete(dto, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAthlete(@PathVariable("id") Long id){
        athleteService.deleteAthlete(id);
        return new ResponseEntity<>("Athlete delete", HttpStatus.OK);
    }
}
