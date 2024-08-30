package com.listadetarefas_backend.lista.de.tarefas.Controllers;

import com.listadetarefas_backend.lista.de.tarefas.Services.DeleteTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTask {

    private DeleteTaskService deleteTaskService;

    @Autowired
    public DeleteTask(DeleteTaskService deleteTaskService) {
        this.deleteTaskService = deleteTaskService;
    }

    @CrossOrigin(origins = "https://list-beige-delta.vercel.app")
    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") Long id) {
        return deleteTaskService.deleteTask(id);
    }

}
