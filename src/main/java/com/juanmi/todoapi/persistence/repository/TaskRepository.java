package com.juanmi.todoapi.persistence.repository;

import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> { //Se crea una entidad de los objetos Task y además Long es el tipo de dato de sus identificadores

    //Usaremos las funcionalidades que nos ofrece Spring Data JPA
    public List<Task> findAllByTaskStatus(TaskStatus status); //Con esto ya accedemos a la Base de Datos y filtramos por "Status"

}
