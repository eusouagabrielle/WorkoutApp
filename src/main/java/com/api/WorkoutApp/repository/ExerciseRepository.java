package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
