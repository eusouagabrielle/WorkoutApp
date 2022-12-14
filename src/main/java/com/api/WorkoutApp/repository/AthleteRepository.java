package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
    List<Athlete> findByTrainerId(Long trainerId);
    Optional<Athlete> findByName(String name);
}
