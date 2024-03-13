package com.nikhil.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.demo.entity.Course;
import com.nikhil.demo.entity.Student;
import com.nikhil.demo.request.CourseRequest;
import com.nikhil.demo.service.CourseService;


@RestController
@RequestMapping("api/v1/course/")
public class CourseController {
//	
	@Autowired
	CourseService courseService;

	@PostMapping("save")
	public ResponseEntity<String> saveEmployee(@RequestBody CourseRequest courseRequest) {

		Course course = courseService.saveCourse(courseRequest);
		if (course != null) {
			return new ResponseEntity<>("Course Added...", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// This is the Course Creator who can access particular data from the table
	@GetMapping("get/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return courseService.getCourse(id);
	}

	// This is the Course Creator who can access all the data from the table
	@GetMapping("get/all")
	public List<Course> getAllData() {
		return courseService.getAllCourses();
	}

	
	// Using this method Student can get Details of particular
	//course but he cannot see Type and learning mode of course
	
	// We have created only get method so user cannot write into the database
	@GetMapping("get/student/{id}")
	public Student getData(@PathVariable Long id) {
		Course course = courseService.getCourse(id);
		Student student = new Student();
		if (course != null) {
			student.setCourseId(course.getCourseId());
			student.setCourseName(course.getCourseName());
			student.setSubject(course.getSubject());
			student.setNoOfChapters(course.getNoOfChapters());
			student.setNoOfClasses(course.getNoOfClasses());
		}
		return student;
	}
}
