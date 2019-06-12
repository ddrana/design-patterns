package com.learn.design.pattern.java;

import java.util.Optional;

public class StudentService {
	public Optional<Student> getStudent(int id) {
		switch(id) {
		case 1:
			return Optional.of(new Student(1, "Dharmesh", "Rana"));
		case 2:
			return Optional.of(new Student(1, "Rajvi", "Rana"));
		case 3:
			return Optional.of(new Student(1, "Jaiman", "Rana"));
		default:
			return Optional.empty();
		}
	}
}
