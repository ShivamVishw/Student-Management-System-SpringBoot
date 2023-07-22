package com.example.smsw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.smsw.entity.Student;
import com.example.smsw.repository.StudentRepository;

@SpringBootApplication
public class SmartContactManagerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
				
	}

}
