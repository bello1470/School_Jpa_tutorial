package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
