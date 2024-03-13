package com.nikhil.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectAppApplication.class, args);
		// http://localhost:9091/api/v1/course/get/student/1 -->  To get data by the student 
		// http://localhost:9091/api/v1/course/get/3         -->  To get specific Course using Id by courseDeveloper / Teacher
		//http://localhost:9091/api/v1/course/save           -->  To add / Update the Course by Course Developer / Teacher
		//http://localhost:9091/api/v1/course/get/all        -->  To get all courses used by Course Developer / Teacher
		
	}

}
