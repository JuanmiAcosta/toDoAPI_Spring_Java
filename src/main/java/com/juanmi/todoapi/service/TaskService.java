package com.juanmi.todoapi.service;

import com.juanmi.todoapi.exceptions.ToDoExceptions;
import com.juanmi.todoapi.mapper.TaskInDTOToTask;
import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.persistence.entity.TaskStatus;
import com.juanmi.todoapi.persistence.repository.TaskRepository;
import com.juanmi.todoapi.service.dto.TaskInDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

// Inyección de dependencias y config. de componentes --> Se marca la clase como "bean de servicio"
// contienen la lógica de negocio de la aplicación y se utilizan para encapsular y gestionar la
// lógica relacionada con la manipulación de datos

@Service
public class TaskService {
    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return (this.repository.save(task));
    }

    public List<Task> findAllTask(){
        return (this.repository.findAll());
    }

    public List<Task> findAllByTaskStatus(TaskStatus status){
        return (this.repository.findAllByTaskStatus(status));
    }

    @Transactional // Para controlar las excepciones
    public void updateTaskAsFinished(Long id){
        Optional<Task> optionalTask = this.repository.findById(id); // Hacemos esto primero para recoger excepción en caso de que haga falta

        if (optionalTask.isEmpty()){
            throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND); //Usar la clase excepción en caso de no encomntrar la task
        }

        this.repository.markTaskAsFinished(id);
    }

    public void deleteById(Long id){
        Optional<Task> optionalTask = this.repository.findById(id); // Hacemos esto primero para recoger excepción en caso de que haga falta

        if (optionalTask.isEmpty()){
            throw new ToDoExceptions("Task not found", HttpStatus.NOT_FOUND); //Usar la clase excepción en caso de no encomntrar la task
        }

        this.repository.deleteById(id);
    }
}
