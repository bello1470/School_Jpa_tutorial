package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    //JPA CUSTOM METHOD

    Student findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    Student findByFirstNameAndLastName(String firstName, String lastName);

    List<Student> findStudentByGuardianName(String guardian_Name);

    //JPQL = JAVA  PERSISTENCE QUERY LANGUAGE


    @Query("select s from Student s where s.emailId = ?1")
    List<Student> getStudentByEmailAddress(String emailId);

    @Query("select s.firstName from Student s where s.emailId = ?1")
    Student getStudentByFirstQ(String emailId);


    //NATIVE QUERY


    @Query(
            value = "SELECT * FROM student_db s where s.email_address = ?1",
            nativeQuery = true

    )
    Student getStudentByEmailAddressNative(String emailId);


// PARAM QUERY NATIVE

    @Query(
            value = "SELECT * FROM student_db s where s.email_address = :emailId",
            nativeQuery = true

    )
    Student getStudentByEmailAddressNativeParam(@Param( "emailId") String emailId);
}

