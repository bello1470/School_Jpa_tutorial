package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Course;
import org.bellotech.jpa_tuttt.model.Student;
import org.bellotech.jpa_tuttt.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;


    @Test
    public void printCourses(){

        List<Course> courses = courseRepository
                .findAll();
        System.out.println(courses);
    }

    @Test
    public void saveCourseToStudentandTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("jjj")
                .lastName("mmmm")
                .build();


        Student student2 = Student.builder()
                .firstName("Adlabi")
                .lastName("tobdi")
                .emailId("ajladld")
                .build();

        Course course = Course.builder()
                .title("testing")
                .credits(12)
                .teacher(teacher)
                .build();

        course.addStudent(student2);
        courseRepository.save(course);
    }

}