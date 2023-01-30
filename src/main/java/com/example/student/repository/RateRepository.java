package com.example.student.repository;

import com.example.student.model.RatesOfStudents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<RatesOfStudents,Long> {

}
