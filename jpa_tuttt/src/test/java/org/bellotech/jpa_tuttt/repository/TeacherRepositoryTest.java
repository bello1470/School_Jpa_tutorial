package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Course;
import org.bellotech.jpa_tuttt.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    public void saveTeacherDetails(){

        Course courseJAVA = Course.builder()
                .title("java")
                .credits(6)
                .build();

        Course courseDSA = Course.builder()
                .title("DSA")
                .credits(5)
                .build();


        Teacher teacher = Teacher.builder()
                .firstName("john")
                .lastName("isreal")
                .courses(List.of(courseJAVA,courseDSA))
                .build();
        teacherRepository.save(teacher);
    }

}