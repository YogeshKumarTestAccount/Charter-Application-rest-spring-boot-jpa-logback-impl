package com.charter.capgemini.in.serviceimpl;

import com.charter.capgemini.in.datarepository.CourseRepository;
import com.charter.capgemini.in.model.*;
import com.charter.capgemini.in.service.CourseService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepogitory;

	public CourseServiceImpl() {
	};

	@Override
	public List<Course> getAllCourse(String topicId) {
		List<Course> course = new ArrayList<>();
		courseRepogitory.findByRelatedTopicId(topicId).forEach(course::add);
		System.out.println("course" + course);
		return course;
	}

	public Course getCourse(String id) {

		return courseRepogitory.findOne(id);
	}

	@Override
	public void addCourse(Course course) {

		courseRepogitory.save(course);

	}

	@Override
	public void updateCourse(Course course, String id) {

		courseRepogitory.save(course);

	}

	@Override
	public void deleteCourse(String id) {

		courseRepogitory.delete(id);
	}

	@Override
	public Course getCourseByCourseID(String courseId) {
		return courseRepogitory.findByCourseId(courseId);

	}

}
