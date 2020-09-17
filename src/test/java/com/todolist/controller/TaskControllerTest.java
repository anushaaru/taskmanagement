package com.todolist.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.todolist.dao.TaskRepository;
import com.todolist.model.Task;
import com.todolist.service.TaskService;

@WebMvcTest
public class TaskControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TaskService taskService;
	
	@MockBean
	private TaskRepository taskRepository;
	
	@Test
	public void getTasksList_shouldSucceedWith200() throws Exception {
		mockMvc.perform(get("/tasks")).andExpect(status().is(204));
	}
	
	@Test
	public void getListofTasksByUserIdTest() throws Exception {
		List<Task> listTask = new ArrayList<>();
		Task task =  new Task();
		task.setId(1);
		task.setCreateDate(new Date());
		task.setDescription("new");
		task.setStatus("done");
		task.setUserId("ABC");
		listTask.add(task);
		task.setLastupdatedDate(new Date());
		mockMvc.perform(get("/tasklist/Anusha")).andExpect(status().is(200));
	}
}
