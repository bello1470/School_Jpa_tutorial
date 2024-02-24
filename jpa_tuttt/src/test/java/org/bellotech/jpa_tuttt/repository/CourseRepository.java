package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
