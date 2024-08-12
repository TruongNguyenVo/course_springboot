package com.javastudent.todo_management.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javastudent.todo_management.dto.TodoDto;
import com.javastudent.todo_management.service.TodoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {
    private TodoService todoService;

    //add restAPI
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){
        TodoDto saveTodoDto =  todoService.addTodo(todoDto);
        return new ResponseEntity<>(saveTodoDto, HttpStatus.CREATED);
    }

    //get todo by id
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable("id") Long todoDtoId){
        TodoDto todoDtoGet = todoService.getToDoById(todoDtoId);
        return new ResponseEntity<>(todoDtoGet, HttpStatus.OK);
    }

    //get all todo
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodo(){
        List<TodoDto> todos = todoService.getAllTodo();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    //completed todo
    @PreAuthorize("hasRole('ADMIN')")
    @PatchMapping("{id}/completed")
    public ResponseEntity<TodoDto> completedTodo(@PathVariable("id") Long todoID){
        TodoDto updateDto = todoService.completedTodo(todoID);
        return ResponseEntity.ok(updateDto);
    }
}
