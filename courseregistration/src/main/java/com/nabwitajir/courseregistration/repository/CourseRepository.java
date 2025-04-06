package com.nabwitajir.courseregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nabwitajir.courseregistration.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
