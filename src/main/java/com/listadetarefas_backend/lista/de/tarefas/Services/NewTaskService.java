package com.listadetarefas_backend.lista.de.tarefas.Services;

import com.listadetarefas_backend.lista.de.tarefas.Entitys.Tasks;
import com.listadetarefas_backend.lista.de.tarefas.Repositorys.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class NewTaskService {
    private TaskRepository taskRepository;

    @Autowired
    public NewTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String newTask(String task, boolean isCompleted, LocalDate year, LocalTime hour, String color) {
        try {
            Tasks newTask = new Tasks(task, isCompleted, year, hour, color);
            taskRepository.save(newTask);
            return "Sucesso";
        } catch (Exception e) {
            return "erro ao cadastrar nova tarefa" + e;
        }
    }
}
