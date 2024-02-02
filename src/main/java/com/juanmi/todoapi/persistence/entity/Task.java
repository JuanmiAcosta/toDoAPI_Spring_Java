package com.juanmi.todoapi.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //Esto es de lombok, literalmente Jesucristo, te genera los getters, setters, toString, equals y hashCode
@Entity //Entidad en base de datos (tabla)
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO ) //Para que el Id se cree de manera automática ( hibernate )
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime estimatedDate;
    private boolean finished;
    private TaskStatus taskStatus;

}
