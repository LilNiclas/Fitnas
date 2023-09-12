package com.example.fitnesswebapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workout")
    private List<ExerciseEntry> exerciseEntries;

    public Workout(Long id, String name, List<ExerciseEntry> exerciseEntries) {
        this.id = id;
        this.name = name;
        this.exerciseEntries = exerciseEntries;
    }

    public Workout() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExerciseEntry> getExerciseEntries() {
        return exerciseEntries;
    }

    public void setExerciseEntries(List<ExerciseEntry> exerciseEntries) {
        this.exerciseEntries = exerciseEntries;
    }
}

