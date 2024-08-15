package com.listadetarefas_backend.lista.de.tarefas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class NewTask {

    @PostMapping("/newtask")
    public String newTask(@RequestBody TarefasBody tarefasBody) {
        return "sucess";
    }

    public static class TarefasBody {
        private String task;
        private boolean completed;
        private String cor;
        private String hour;
        private String year;

        public static void TarefasBody() {

        }

        public String getTask() {
            return task;
        }

        public boolean isCompleted() {
            return completed;
        }

        public String getCor() {
            return cor;
        }

        public String getHour() {
            return hour;
        }

        public String getYear() {
            return year;
        }


    }
}
