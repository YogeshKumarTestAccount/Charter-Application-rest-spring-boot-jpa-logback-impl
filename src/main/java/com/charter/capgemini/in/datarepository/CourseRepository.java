package com.charter.capgemini.in.datarepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.charter.capgemini.in.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByRelatedTopicId(String topicId);

	public Course findByCourseId(String courseId);
}
