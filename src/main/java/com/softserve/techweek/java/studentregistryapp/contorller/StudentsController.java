package com.softserve.techweek.java.studentregistryapp.contorller;

import com.softserve.techweek.java.studentregistryapp.contorller.dto.StudentDto;
import com.softserve.techweek.java.studentregistryapp.contorller.dto.StudentWithIdDto;
import com.softserve.techweek.java.studentregistryapp.contorller.mapper.StudentMapper;
import com.softserve.techweek.java.studentregistryapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService studentService;

    private final StudentMapper studentMapper;

    @GetMapping
    public List<StudentWithIdDto> getAllStudents() {
        return studentService.getAllStudents().stream()
                .map(studentMapper::toStudentWithDto)
                .toList();
    }

    @PostMapping
    public Integer createStudent(@RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentMapper.toStudentDto(studentDto));
    }
    
    @DeleteMapping("/{id}")
    public Integer deleteStudent(@PathVariable("id") Integer id) {
        return null;
    }

}
