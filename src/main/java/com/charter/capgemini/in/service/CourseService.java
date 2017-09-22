package com.charter.capgemini.in.service;

import com.charter.capgemini.in.model.Course;
import com.charter.capgemini.in.service.CourseService;
import java.util.List;

public interface CourseService {

	public List<Course> getAllCourse(String topicId);

	public Course getCourse(String id);

	public void addCourse(Course course);

	public void updateCourse(Course course, String id);

	public void deleteCourse(String id);

	public Course getCourseByCourseID(String courseId);

}
