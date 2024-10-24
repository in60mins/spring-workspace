package com.example.service;


import com.example.dto.Dto;

import java.util.List;

public interface TeacherService {
    Dto createTeacher(Dto dto);

    Dto getTeacherById(Long id);

    List<Dto> getAll();

    Dto updateTeacher(Long id,Dto dto);

    void deleteTeacher(Long id);
}
