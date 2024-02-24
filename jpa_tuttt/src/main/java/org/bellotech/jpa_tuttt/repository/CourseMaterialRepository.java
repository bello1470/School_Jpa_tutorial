package org.bellotech.jpa_tuttt.repository;

import org.bellotech.jpa_tuttt.model.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
