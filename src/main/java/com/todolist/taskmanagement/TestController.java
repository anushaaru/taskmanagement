/*
 * package com.todolist.taskmanagement;
 * 
 * import java.net.URI; import java.util.Date; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Qualifier; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Component; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 * 
 * import com.todolist.dao.TaskDaoService; import
 * com.todolist.exceptions.TaskNotFoundException; import
 * com.todolist.model.Task; import com.todolist.service.TaskService;
 * 
 * @Component public class TestController {
 * 
 * @Autowired TaskDaoService taskDaoService;
 * 
 * @Autowired TaskService taskService;
 * 
 * @GetMapping("/tasks") public List<Task> retrieveAllTasks(){ List<Task> tasks
 * = taskService.listOfTasks(); if(tasks.isEmpty()) {
 * System.out.println("Empty"); } return tasks; }
 * 
 * @PostMapping("/addtask") public ResponseEntity<Object> addTask(@RequestBody
 * Task task) { Task savedtask = taskDaoService.save(task);
 * 
 * URI location = ServletUriComponentsBuilder.fromCurrentRequest().
 * path("/{id}").buildAndExpand(savedtask.getId()).toUri(); return
 * ResponseEntity.created(location).build(); }
 * 
 * @GetMapping("/tasks/{id}") public Task retrieveTask(@PathVariable int id) {
 * Task task = taskDaoService.findOne(id); if(task == null) throw new
 * TaskNotFoundException("id-"+id);
 * 
 * return task;
 * 
 * }
 * 
 * 
 * @GetMapping("/tasks") public List<Task> retrieveAllTasks(){ return
 * taskDaoService.findAll(); }
 * 
 * @GetMapping(path="/helloWorld") public String test() {
 * System.out.println("home page requested"); return "HelloWorld"; }
 * 
 * @GetMapping(path="/test") public String test1() {
 * System.out.println("home page requested"); return "index.jsp"; }
 * 
 * @GetMapping(path="/taskDetails") public Task test2() {
 * 
 * return new Task(1, new Date(), "task1", "notdone", "us1",new Date()); }
 * 
 * 
 * }
 */