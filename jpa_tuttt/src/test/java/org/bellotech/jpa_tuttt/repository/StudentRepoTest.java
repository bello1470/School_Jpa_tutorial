package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Guardian;
import org.bellotech.jpa_tuttt.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;



    @Test
    public void saveStudent(){


        Student student = Student.builder()
                .firstName("bola")
                .lastName("bolu")
                .emailId("abc@gmail.com")

                .build();
        studentRepo.save(student);


    }

    @Test
    public  void saveStudentGuardian(){

        Guardian guardians1 = Guardian.builder()
                .name("mummy1")
                .email("daddy1@gmail.com")
                .mobile("1234569")
                .build();
        Student students1 = Student.builder()
                .firstName("ahmed")
                .lastName("kiekie")
                .emailId("abg@gmail.com")
                .guardian(guardians1)
                .build();
        studentRepo.save(students1);

        Guardian guardians = Guardian.builder()
                .name("mummy")
                .email("daddy@gmail.com")
                .mobile("123456")
                .build();

        Student students = Student.builder()
                .firstName("bolla")
                .lastName("bollu")
                .emailId("abcg@gmail.com")
                .guardian(guardians)
                .build();
        studentRepo.save(students);
    }

    @Test
    public void findStudentByName(){
        Student s1 = studentRepo.findByFirstName("bolla");
        System.out.println(s1);
    }

    @Test
    public void findByFirstNameAndLastNames(){

        Student s2 = studentRepo.findByFirstNameAndLastName("ahmed","kiekie");
        System.out.println(s2);
    }

    @Test
    public  void findStudentByGuardianNames(){

        List<Student> s3 = studentRepo.findStudentByGuardianName("mummy");
        System.out.println(s3);
    }

    @Test
    public void printAll(){

        List<Student> students = studentRepo.findAll();
        System.out.println(students.toString());

    }

    @Test 
    public void getStudentEmailAddress() {

       List <Student> s4 = studentRepo.getStudentByEmailAddress("abcg@gmail.com");

        System.out.println(s4);
    }



}