package com.example.mapper;


import com.example.dto.Dto;
import com.example.modal.Teacher;

public class TeacherMapper {
    public static Dto mapToDto(Teacher teacher){
        return new Dto(
                teacher.getTeacherId(),
                teacher.getFirstName(),
                teacher.getLastName(),
                teacher.getDepartment(),
                teacher.getEmail()
        );
    }
    public static Teacher mapToTeacher(Dto dto){
        return new Teacher(
                dto.getTeacherId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getDepartment(),
                dto.getEmail()
        );
    }
}
