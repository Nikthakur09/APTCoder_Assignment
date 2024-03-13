package com.nikhil.demo.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.demo.entity.Course;
import com.nikhil.demo.repo.CourseRepository;
import com.nikhil.demo.request.CourseRequest;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course saveCourse(CourseRequest courseRequest) {

		Course course = new Course();
		if (courseRequest.getCourseId() != 0) {
			Optional<Course> emp = courseRepository.findById(courseRequest.getCourseId());
			if (emp.isPresent()) {
				course = emp.get();
			} else {
				course = new Course();
			}
		}
		BeanUtils.copyProperties(courseRequest, course);
		return (Course) courseRepository.save(course);
	}

	// Course Developer can access course by id
	@Override
	public Course getCourse(Long id) {
		Optional<Course> emp = courseRepository.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		} else {
			new Course();
		}
		return null;
	}

	// Course Developer can access all courses

	@Autowired
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

}
