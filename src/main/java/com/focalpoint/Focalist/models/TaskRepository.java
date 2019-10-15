package com.focalpoint.Focalist.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
   List<Task> findByApplicationUserIdOrderByUtcTime(long id);
}
