package com.softserve.techweek.java.studentregistryapp.service;

import com.softserve.techweek.java.studentregistryapp.repository.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Integer createStudent(Student student);
}
