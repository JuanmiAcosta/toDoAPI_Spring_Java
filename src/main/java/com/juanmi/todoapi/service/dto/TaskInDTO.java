package com.juanmi.todoapi.service.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO { // Datos de la Task que son introducidos por el usuario

    private String title;
    private String description;
    private LocalDateTime estimatedDate;

}
