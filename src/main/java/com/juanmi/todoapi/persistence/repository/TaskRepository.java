package com.juanmi.todoapi.persistence.repository;

import com.juanmi.todoapi.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> { //Se crea una entidad de los objetos Task y además Long es el tipo de dato de sus identificadores

}
