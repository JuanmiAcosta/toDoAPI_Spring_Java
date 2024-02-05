package com.juanmi.todoapi.controller;

import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.service.TaskService;
import com.juanmi.todoapi.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //La capa de controlador sólo debe comuynicarse con la capa de servicio
@RequestMapping("/tasks")
public class TaskController { //Para acceder a la docu swagger -> localhost:8080/swagger-ui.html

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping //Creamos elementos
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
        return (this.taskService.createTask(taskInDTO));
    }
}
