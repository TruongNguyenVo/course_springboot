package com.javastudent.todo_management.service;

import java.util.List;

import com.javastudent.todo_management.dto.TodoDto;

public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);
    TodoDto getToDoById(Long todoDtoID);
    List<TodoDto> getAllTodo();
    TodoDto completedTodo(Long id);
}
