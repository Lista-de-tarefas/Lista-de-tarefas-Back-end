package com.listadetarefas_backend.lista.de.tarefas.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllTask {

    @GetMapping("/gettask")
    public void getAllTask(){

    }
}
