package com.nikhil.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.demo.entity.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	// this interface will give us funtions for the CRUD operations
}
