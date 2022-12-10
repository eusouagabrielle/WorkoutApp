package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
