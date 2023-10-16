package com.todo.spring.task;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Task {
    @Id
    @GeneratedValue
    // this is the primary key which will be auto generated
    private Long id;
    private String task;
    private boolean completed;

    public Task(String task, boolean completed) {
        this.task = task;
        this.completed = completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
