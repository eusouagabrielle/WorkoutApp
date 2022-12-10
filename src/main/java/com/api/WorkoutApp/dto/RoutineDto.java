package com.api.WorkoutApp.dto;

import com.api.WorkoutApp.model.Exercise;
import lombok.Data;

import java.util.List;

@Data
public class RoutineDto {
    private Long id;
    private String name;
    private String description;
    private int durationInWeeks;
    private String difficultyLevel;
    private List<Exercise> exercises;
}
