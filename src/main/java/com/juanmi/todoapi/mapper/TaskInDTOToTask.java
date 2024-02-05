package com.juanmi.todoapi.mapper;

import com.juanmi.todoapi.persistence.entity.Task;
import com.juanmi.todoapi.persistence.entity.TaskStatus;
import com.juanmi.todoapi.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper <TaskInDTO, Task>{
    @Override
    public Task map(TaskInDTO taskInDTO) {
        Task task = new Task();

        task.setTitle(taskInDTO.getTitle());
        task.setDescription(taskInDTO.getDescription());
        task.setEstimatedDate(taskInDTO.getEstimatedDate());

        task.setCreatedDate(LocalDateTime.now());
        task.setTaskStatus(TaskStatus.ON_TIME);
        task.setFinished(false);

        return task;
    }
}
