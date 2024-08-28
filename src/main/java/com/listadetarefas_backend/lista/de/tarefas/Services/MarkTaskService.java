package com.listadetarefas_backend.lista.de.tarefas.Services;

import com.listadetarefas_backend.lista.de.tarefas.Entitys.Tasks;
import com.listadetarefas_backend.lista.de.tarefas.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarkTaskService {
    private TaskRepository taskRepository;

    @Autowired
    public MarkTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String markTask(long id) {
        Optional<Tasks> optionalTasks = taskRepository.findById(id);
        if (optionalTasks.isPresent()) {
            Tasks tasks = optionalTasks.get();
            boolean value = tasks.getIsCompleted();
            tasks.setIsCompleted(!value);
            taskRepository.save(tasks);
            return "Tarefa marcada com sucesso!";
        }
        return "Falha ao marcar tarefa!";
    }
}
