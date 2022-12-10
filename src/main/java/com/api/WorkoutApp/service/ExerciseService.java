package com.api.WorkoutApp.service;

import com.api.WorkoutApp.dto.ExerciseDto;

import java.util.List;

public interface ExerciseService {
    ExerciseDto createExercise(ExerciseDto dto );
    List<ExerciseDto> getAllExercises();
    ExerciseDto getExerciseById(Long id);
    ExerciseDto updateExercise(ExerciseDto dto, Long id);
    void deleteExercise(Long id);
}
