package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
    List<Athlete> findByTrainerId(Long trainerId);
}
