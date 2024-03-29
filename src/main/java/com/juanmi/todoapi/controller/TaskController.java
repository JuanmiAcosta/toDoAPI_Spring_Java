package com.juanmi.todoapi.controller;

import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.persistence.entity.TaskStatus;
import com.juanmi.todoapi.service.TaskService;
import com.juanmi.todoapi.service.dto.TaskInDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //La capa de controlador sólo debe comunicarse con la capa de servicio
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

    @GetMapping
    public List<Task> findAllTask() { return this.taskService.findAllTask(); }

    @GetMapping("/status/{status}") //@PathVariable la variable se lee en el path
    public List<Task> findAllByTaskStatus(@PathVariable("status")TaskStatus status){ return this.taskService.findAllByTaskStatus(status); }

    @PatchMapping("/mark_as_finished/{id}")
    public ResponseEntity<Void> markAsFinished(@PathVariable("id")Long id){
        this.taskService.updateTaskAsFinished(id);
        return ResponseEntity.noContent().build(); //Para mandar una respuesta HTTP | NoContent --> 204
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        this.taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
