package com.nabwitajir.courseregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nabwitajir.courseregistration.entity.Course;
import com.nabwitajir.courseregistration.service.CourseService;

@RestController
@RequestMapping(path = "/api",produces = {MediaType.APPLICATION_JSON_VALUE})
public class CourseController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Long id) {
		Optional<Course> course = courseService.getCourseById(id);
		return course.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
		return ResponseEntity.ok(courseService.deleteCourse(id));
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable Long id,@RequestBody Course course){
		return ResponseEntity.ok(courseService.updateCourse(id, course));
	}
}
