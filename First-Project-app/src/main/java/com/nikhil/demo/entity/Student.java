package com.nikhil.demo.entity;
import java.util.List;

import com.nikhil.demo.controller.CourseController;
public class Student {
	private long courseId;
	private String courseName;
	private String subject;
	private long noOfChapters;
	private long noOfClasses;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getNoOfChapters() {
		return noOfChapters;
	}
	public void setNoOfChapters(long noOfChapters) {
		this.noOfChapters = noOfChapters;
	}
	public long getNoOfClasses() {
		return noOfClasses;
	}
	public void setNoOfClasses(long noOfClasses) {
		this.noOfClasses = noOfClasses;
	}
	
	
	
}
