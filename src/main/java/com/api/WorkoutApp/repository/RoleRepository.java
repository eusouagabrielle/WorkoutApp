package com.api.WorkoutApp.repository;

import com.api.WorkoutApp.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Authority, Long> {
    Authority findByName(String name);
}
