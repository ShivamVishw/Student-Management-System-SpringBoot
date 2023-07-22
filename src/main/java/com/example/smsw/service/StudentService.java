package com.example.smsw.service;
import java.util.List;

import com.example.smsw.entity.Student;
public interface StudentService {
	List<Student> getAllStudents();
	
	//all the servicing stuffs will be done here
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
