package com.example.smsw.repository; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smsw.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
