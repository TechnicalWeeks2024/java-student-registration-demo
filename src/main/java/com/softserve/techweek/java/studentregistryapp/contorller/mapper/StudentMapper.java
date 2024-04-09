package com.softserve.techweek.java.studentregistryapp.contorller.mapper;

import com.softserve.techweek.java.studentregistryapp.contorller.dto.StudentDto;
import com.softserve.techweek.java.studentregistryapp.contorller.dto.StudentWithIdDto;
import com.softserve.techweek.java.studentregistryapp.repository.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDto toStudentDto(Student student) {
        return new StudentDto(student.getName(), student.getSurname(), student.getAge());
    }

    public StudentWithIdDto toStudentWithDto(Student student) {
        return new StudentWithIdDto(student.getId(), student.getName(), student.getSurname(), student.getAge());
    }
    
    public Student toStudentDto(StudentDto studentDto){
        return new Student()
                .setSurname(studentDto.surname())
                .setName(studentDto.name())
                .setAge(studentDto.age());
    }
}
