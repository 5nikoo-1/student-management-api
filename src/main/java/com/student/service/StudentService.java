package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import java.util.List;

public class StudentService {

    private final StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        Student student = repository.findById(id);
        if (student == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        return student;
    }

    public void addStudent(Student student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }
        if (student.getGrade() < 0 || student.getGrade() > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        repository.save(student);
    }

    public void updateStudent(int id, Student student) {
        getStudentById(id);
        repository.update(id, student);
    }

    public void deleteStudent(int id) {
        getStudentById(id);
        repository.delete(id);
    }
}