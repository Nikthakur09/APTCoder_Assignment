package com.nikhil.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private long courseId;

	@Column()
	private String courseName;

	@Column(name = "subject_name")
	private String subject;

	@Column()
	private long noOfChapters;

	@Column()
	private long noOfClasses;

	@Column(name = "type")
	private String type;

	@Column(name = "learn_mode")
	private String learnMode;

	public Course() {
		// TODO Auto-generated constructor stub
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLearnMode() {
		return learnMode;
	}

	public void setLearnMode(String learnMode) {
		this.learnMode = learnMode;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", subject=" + subject
				+ ", noOfChapters=" + noOfChapters + ", noOfClasses=" + noOfClasses + ", type=" + type + ", learnMode="
				+ learnMode + "]";
	}

}
