package com.example.TodoStudy.service;

import com.example.TodoStudy.model.TodoEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceTest {



    @Test
    void testService() {
        TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
    }

    @Test
    void create() {
    }

    @Test
    void select() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void validate() {
    }
}