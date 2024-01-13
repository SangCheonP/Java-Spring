package com.zerock.w1.todo.service;

import com.sun.tools.javac.comp.Todo;
import com.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE; // 하나의 객체만 만들도록

    public void register(TodoDTO todoDTO){

        System.out.println("Debug........." + todoDTO);
    }

    public List<TodoDTO> getList(){

        List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.." + i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }
}
