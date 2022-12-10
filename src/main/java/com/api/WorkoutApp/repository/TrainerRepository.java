package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
