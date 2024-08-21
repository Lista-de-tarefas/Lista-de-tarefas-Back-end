package com.listadetarefas_backend.lista.de.tarefas.Repositorys;

import com.listadetarefas_backend.lista.de.tarefas.Entitys.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, Long> {

}
