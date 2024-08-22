package com.listadetarefas_backend.lista.de.tarefas.Services;

import com.listadetarefas_backend.lista.de.tarefas.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskService {

    private TaskRepository taskRepository;

    @Autowired
    public DeleteTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public String deleteTask(Long id){
        try {
            taskRepository.deleteById(id);
            return "apagado com sucesso!";
        }catch (Exception e){
            return "erro ao apagar tarefa";
        }
    }
}
