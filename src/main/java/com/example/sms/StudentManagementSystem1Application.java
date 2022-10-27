package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ram", "Singh", "ram22@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Dev", "Kumar", "dev01@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Abhishekh", "Kadam", "abhiskeh34@gmail.com");
//		studentRepository.save(student3);
		
	}}