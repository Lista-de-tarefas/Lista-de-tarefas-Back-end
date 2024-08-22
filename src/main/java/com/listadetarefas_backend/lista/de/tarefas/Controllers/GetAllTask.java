package com.listadetarefas_backend.lista.de.tarefas.Controllers;

import com.listadetarefas_backend.lista.de.tarefas.Entitys.Tasks;
import com.listadetarefas_backend.lista.de.tarefas.Services.GetAllTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllTask {
    private GetAllTask getAllTask;

    @Autowired
    public GetAllTask(GetAllTask getAllTask) {
        this.getAllTask = getAllTask;
    }
    @GetMapping("/gettask")
    public List<Tasks> getAllTask() {
        return getAllTask.getAllTask();
    }
}

