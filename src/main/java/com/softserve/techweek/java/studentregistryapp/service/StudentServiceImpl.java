package com.softserve.techweek.java.studentregistryapp.service;

import com.softserve.techweek.java.studentregistryapp.repository.Student;
import com.softserve.techweek.java.studentregistryapp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Integer createStudent(Student student) {
        return studentRepository.save(student).getId();
    }
}
