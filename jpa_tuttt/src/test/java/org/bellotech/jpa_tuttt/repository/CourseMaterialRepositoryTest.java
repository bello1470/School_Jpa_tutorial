package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Course;
import org.bellotech.jpa_tuttt.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMAterial(){

        Course course = Course.builder()
                .title("java")
                .credits(6)
                .build();


        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial(){

        List<CourseMaterial> courseMaterials =
                courseMaterialRepository.findAll();
        System.out.println(courseMaterials);
    }

}