package com.api.WorkoutApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String targetMuscle;
    @Column(nullable = false)
    private int sets;
    @Column(nullable = false)
    private int repetitions;
    @Column(nullable = false)
    private int weight;
    @ManyToMany(mappedBy = "exercises")
    private List<Routine> routines;
}
