package com.listadetarefas_backend.lista.de.tarefas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.listadetarefas_backend.lista.de.tarefas.Services.NewTaskService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class NewTask {

    private final NewTaskService newTaskService;

    @Autowired
    public NewTask(NewTaskService newTaskService) {
        this.newTaskService = newTaskService;
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/newtask")
    public String newTask(@RequestBody Task taskBody) {
        return newTaskService.newTask(
                taskBody.getTask(),
                taskBody.getCompleted(),
                taskBody.getYear(),
                taskBody.getHour(),
                taskBody.getColor()
        );
    }

    public static class Task {
        public String task;
        public boolean isCompleted;
        public String year;
        public String hour;
        public String color;

        public Task(String task, boolean isCompleted, String year, String hour, String color) {
            this.task = task;
            this.isCompleted = isCompleted;
            this.year = year;
            this.hour = hour;
            this.color = color;
        }

        public String getTask() {
            return task;
        }

        public boolean getCompleted() {
            return isCompleted;
        }

        public LocalDate getYear() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(year, formatter);
        }

        public LocalTime getHour() {
            return LocalTime.parse(hour);
        }

        public String getColor() {
            return color;
        }
    }
}
