package br.com.petersonaraujo.desafio_todolist.controller;

import br.com.petersonaraujo.desafio_todolist.entity.Todo;
import br.com.petersonaraujo.desafio_todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping
    List<Todo> update(@RequestBody  Todo todo) {
        return todoService.update(todo);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable  Long id) {
        return todoService.delete(id);
    }
}
