package com.juanmi.todoapi.service;

import com.juanmi.todoapi.mapper.TaskInDTOToTask;
import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.persistence.entity.TaskStatus;
import com.juanmi.todoapi.persistence.repository.TaskRepository;
import com.juanmi.todoapi.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
