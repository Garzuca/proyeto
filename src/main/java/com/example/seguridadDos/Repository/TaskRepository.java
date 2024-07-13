package com.example.seguridadDos.Repository;

import com.example.seguridadDos.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
