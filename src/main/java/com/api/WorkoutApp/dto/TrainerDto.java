package com.api.WorkoutApp.dto;

import com.api.WorkoutApp.model.Athlete;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TrainerDto {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer kvkNumber;
    private Integer age;
    private Integer yearsOfExperience;
    private List<Athlete> athletes = new ArrayList<Athlete>();
}
