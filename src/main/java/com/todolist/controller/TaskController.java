package com.todolist.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.todolist.exceptions.TaskHandleException;
import com.todolist.model.Task;
import com.todolist.service.TaskService;

@RestController
public class TaskController {
	
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/tasks")
	public ResponseEntity<List<Task>> getListOfTasks() {
		logger.info("Get List of tasks");
		try {
			List<Task> tasks = taskService.listOfTasks();
			if (tasks.isEmpty()) {
				return new ResponseEntity<List<Task>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
		} catch (Exception ex) {
			throw new TaskHandleException(ex);
		}
	}
	
	@GetMapping("/tasklist/{userId}")
	public ResponseEntity<List<Task>> getListOfTasksByUserId(@PathVariable("userId") String userId) {
		logger.info("Get List of tasks by user id:"+userId);
		try {
			List<Task> tasks = taskService.getListOfTasksByUserId(userId);
			if (tasks.isEmpty()) {
				return new ResponseEntity<List<Task>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
		} catch (Exception ex) {
			throw new TaskHandleException(ex);
		}
	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity<Task> getTask(@PathVariable("id") int id) {
		logger.info("Get Task by id: " + id);
		try {
			Task task = taskService.getTaskById(id);
			if (task == null) {
				return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Task>(task, HttpStatus.OK);
		} catch (Exception ex) {
			throw new TaskHandleException(ex);
		}
	}
	
	@PostMapping("/tasks/task")
	public ResponseEntity<String> createTask(@RequestBody Task task) {
		logger.info("User adding new task");
		try {
			taskService.addOrUpdateTask(task);
			return new ResponseEntity<String>("Task Added successfully", HttpStatus.OK);
		} catch (Exception ex) {
			throw new TaskHandleException(ex);
		}
	}

	@DeleteMapping("/deletetask/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable("id") int id) {
		logger.info("Deleting Task by id: " + id);
		try {
			taskService.deleteTask(id);
			return new ResponseEntity<String>("Task Deleted successfully", HttpStatus.OK);
		} catch (Exception ex) {
			throw new TaskHandleException(ex);
		}
	}
	
	/*
	 * TaskDaoService taskDaoService = new TaskDaoService();
	 * 
	 * @GetMapping("/taskslist") public List<Task> retrieveAllUsers(){ return
	 * taskDaoService.findAll(); }
	 */
	
	
}
