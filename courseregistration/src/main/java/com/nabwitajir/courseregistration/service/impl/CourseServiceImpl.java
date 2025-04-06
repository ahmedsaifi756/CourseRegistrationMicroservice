package com.nabwitajir.courseregistration.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabwitajir.courseregistration.entity.Course;
import com.nabwitajir.courseregistration.repository.CourseRepository;
import com.nabwitajir.courseregistration.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Optional<Course> getCourseById(Long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id);
	}

	@Override
	public Course updateCourse(Long id, Course course) {
		Optional<Course> existingCourse = courseRepository.findById(id);
		if(existingCourse.isPresent()) {
			Course updateCourse = existingCourse.get();
			updateCourse.setName(course.getName());
			updateCourse.setDescription(course.getDescription());
			updateCourse.setPrice(course.getPrice());
			courseRepository.save(updateCourse);
		}
		return null;
	}

	@Override
	public String deleteCourse(Long id) {
		// TODO Auto-generated method stub
		if(courseRepository.existsById(id)) {
			courseRepository.deleteById(id);
			return "Course with "+id+" is succesfully deleted";
		}else {
			return "Course with "+id+" not found";
		}		
	}

}
