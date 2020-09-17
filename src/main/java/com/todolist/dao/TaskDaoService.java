/*
 * package com.todolist.dao;
 * 
 * import java.util.ArrayList; import java.util.Date; import java.util.Iterator;
 * import java.util.List;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import com.todolist.model.Task;
 * 
 * @Component public class TaskDaoService { private static List<Task> tasks =
 * new ArrayList<>();
 * 
 * private static int count = 3; static { tasks.add(new Task(1, new Date(),
 * "task1", "notdone", "us1",new Date())); tasks.add(new Task(2, new Date(),
 * "task2", "nodone", "us2",new Date())); tasks.add(new Task(3, new Date(),
 * "task3", "done", "us3",new Date())); } public List<Task> findAll(){ return
 * tasks; }
 * 
 * public Task save(Task task) {
 * 
 * tasks.add(task); return task; }
 * 
 * public Task findOne(int id) { for (Task task : tasks) { if (task.getId() ==
 * id) { return task; } } return null; }
 * 
 * public Task deleteById(int id) { Iterator<Task> iterator = tasks.iterator();
 * while (iterator.hasNext()) { Task task = iterator.next(); if (task.getId() ==
 * id) { iterator.remove(); return task; } } return null; } }
 */