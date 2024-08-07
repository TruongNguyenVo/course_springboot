package com.javastudent.todo_management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
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
    private ModelMapper modelMapper;


    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        //convert TodoDto into Todo jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);
            
        //Todo jpa entity
        Todo savedTodo = todoRepository.save(todo);
        //Convert todo jpa entity into todoDto
        TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);
        return savedTodoDto;
    }

    @Override
    public TodoDto getToDoById(Long todoDtoID) {
        Todo todo = todoRepository.findById(todoDtoID).get();
        TodoDto todoDto = modelMapper.map(todo, TodoDto.class);
        return todoDto;
    }

    @Override
    public List<TodoDto> getAllTodo() {
        List<Todo> todos = todoRepository.findAll();
        return todos.stream().map((todo) -> modelMapper.map(todo, TodoDto.class)).collect(Collectors.toList());
    }

    @Override
    public TodoDto completedTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();
        todo.setCompleted(Boolean.TRUE);
        Todo savedTodo = todoRepository.save(todo);
        TodoDto todoDto = modelMapper.map(savedTodo, TodoDto.class);
        return todoDto;

    }












}
