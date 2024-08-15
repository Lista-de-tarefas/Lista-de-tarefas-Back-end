package com.listadetarefas_backend.lista.de.tarefas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefasPost {

    @PostMapping("/create")
    public String create (@RequestBody TarefasBody tarefasBody){
        return "sucess";
    }

    public static class TarefasBody {
        String task;
        Boolean completetd;
        String cor;
        String hour;
        String year;

        public static void TarefasBody (){

        }
    }
}
