package com.api.WorkoutApp.service;

import com.api.WorkoutApp.dto.TrainerDto;

import java.util.List;

public interface TrainerService {
    TrainerDto createTrainer(TrainerDto dto);
    List<TrainerDto> getAllTrainers();
    TrainerDto getTrainerById(Long id);

    TrainerDto updateTrainer(TrainerDto dto, Long id);

    void deleteTrainer(Long id);
}
