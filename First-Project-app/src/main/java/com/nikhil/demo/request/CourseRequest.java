package com.nikhil.demo.request;
public class CourseRequest {
	
    private long courseId;
	private String courseName;
	private String subject;
	private long noOfChapters;
	private long noOfClasses;
	private String type;
	private String learnMode;

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
		return "CourseRequest [courseId=" + courseId + ", courseName=" + courseName + ", subject=" + subject
				+ ", noOfChapters=" + noOfChapters + ", noOfClasses=" + noOfClasses + ", type=" + type + ", learnMode="
				+ learnMode + "]";
	}

}
