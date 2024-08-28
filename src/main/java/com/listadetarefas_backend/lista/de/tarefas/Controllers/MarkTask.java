package com.listadetarefas_backend.lista.de.tarefas.Controllers;

import com.listadetarefas_backend.lista.de.tarefas.Services.MarkTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkTask {

    private MarkTaskService markTaskService;

    @Autowired
    public MarkTask(MarkTaskService markTaskService) {
        this.markTaskService = markTaskService;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PatchMapping("/mark-task/{id}")
    public String markTask(@PathVariable("id") long id) {
        return markTaskService.markTask(id);
    }
}
