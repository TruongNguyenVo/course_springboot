package com.javastudent.todo_management.service.impl;

import org.springframework.stereotype.Service;

import com.javastudent.todo_management.dto.TodoDto;
import com.javastudent.todo_management.entity.Todo;
import com.javastudent.todo_management.repository.TodoRepository;
import com.javastudent.todo_management.service.TodoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService{

    private TodoRepository todoRepository;


    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        //convert TodoDto into Todo jpa entity
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDecription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());
        
        //Todo jpa entity
        Todo savedTodo = todoRepository.save(todo);

        //Convert todo jpa entity into todoDto
        TodoDto savedTodoDto = new TodoDto();
        savedTodoDto.setTitle(savedTodo.getTitle());
        savedTodoDto.setDescription(savedTodo.getDecription());
        savedTodoDto.setCompleted(savedTodo.isCompleted());



        return savedTodoDto;
    }

}
