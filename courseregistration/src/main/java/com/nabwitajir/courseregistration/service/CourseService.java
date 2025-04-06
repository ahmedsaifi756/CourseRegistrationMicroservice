package com.nabwitajir.courseregistration.service;

import java.util.List;
import java.util.Optional;

import com.nabwitajir.courseregistration.entity.Course;


public interface CourseService {

	Course addCourse(Course course);
	List<Course> getAllCourse();
	Optional<Course> getCourseById(Long id);
	Course updateCourse(Long id,Course course);
	String deleteCourse(Long id);
	
}
