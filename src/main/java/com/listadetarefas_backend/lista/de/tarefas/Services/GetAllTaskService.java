package com.listadetarefas_backend.lista.de.tarefas.Services;

import com.listadetarefas_backend.lista.de.tarefas.Entitys.Tasks;
import com.listadetarefas_backend.lista.de.tarefas.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllTaskService {
    private TaskRepository taskRepository;

    @Autowired
    public GetAllTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getAllTask() {
        return taskRepository.findAll();
    }

}
