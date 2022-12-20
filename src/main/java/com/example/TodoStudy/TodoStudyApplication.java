package com.example.TodoStudy;

import com.example.TodoStudy.service.TodoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoStudyApplication {

	public static void main(String[] args) {

		TodoService service = new TodoService();

		SpringApplication.run(TodoStudyApplication.class, args);
	}

}