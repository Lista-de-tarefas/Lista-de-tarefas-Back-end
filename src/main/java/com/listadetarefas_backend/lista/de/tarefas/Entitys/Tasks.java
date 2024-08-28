package com.listadetarefas_backend.lista.de.tarefas.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String task;
    private boolean isCompleted;
    private LocalDate year;
    private LocalTime hour;
    private String color;

    public Tasks() {

    }

    public Tasks(String task, boolean isCompleted, LocalDate year, LocalTime hour, String color) {

        this.task = task;
        this.isCompleted = isCompleted;
        this.year = year;
        this.hour = hour;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }


    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public LocalDate getYear() {
        return year;
    }

    public LocalTime getHour() {
        return hour;
    }

    public String getColor() {
        return color;
    }
}
