package com.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.todolist.dao.TaskRepository;
import com.todolist.model.Task;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public void addOrUpdateTask(Task task) {
		taskRepository.save(task);
	}
	
	public void deleteTask(int id) {
		taskRepository.deleteById(id);
	}
	
	public List<Task> getListOfTasksByUserId(String userId){
		return taskRepository.findByUserId(userId);
	}
	
	public Task getTaskById(int id) {
		Optional<Task> task = taskRepository.findById(id);
		return task.get();
	}
	
	public List<Task> listOfTasks(){
		System.out.print("tasks");
		return taskRepository.findAll();
	}
}
