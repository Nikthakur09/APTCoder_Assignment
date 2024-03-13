package com.nikhil.demo.service;
import java.util.List;

import com.nikhil.demo.entity.Course;
import com.nikhil.demo.request.CourseRequest;


public interface CourseService {

	Course saveCourse(CourseRequest courseRequest);
	public Course getCourse(Long id);
	public List<Course> getAllCourses();
	
}
