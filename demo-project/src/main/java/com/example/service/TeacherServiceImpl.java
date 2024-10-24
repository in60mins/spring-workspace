package com.example.service;

import com.example.dto.Dto;
import com.example.exception.ResourceNotFoundException;
import com.example.mapper.TeacherMapper;
import com.example.modal.Teacher;
import com.example.repository.TecherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    private TecherRepository teacherRepo;

    @Override
    public Dto createTeacher(Dto dto) {
        Teacher teacher = TeacherMapper.mapToTeacher(dto);
        Teacher saved = teacherRepo.save(teacher);
        return TeacherMapper.mapToDto(saved);
    }

    @Override
    public Dto getTeacherById(Long id) {
        Teacher teacher = teacherRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(id+"Not available ..."));
        return TeacherMapper.mapToDto(teacher);
    }

    @Override
    public List<Dto> getAll() {
        List<Teacher> teachers = teacherRepo.findAll();
        return teachers.stream().map((tea)->TeacherMapper.mapToDto(tea))
                .collect(Collectors.toList());
    }

    @Override
    public Dto updateTeacher(Long id, Dto dto) {
        Teacher teacher = teacherRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(id+"Not available ..."));
        teacher.setFirstName(dto.getFirstName());
        teacher.setLastName(dto.getLastName());
        teacher.setDepartment(dto.getDepartment());
        teacher.setEmail(dto.getEmail());

        Teacher updated = teacherRepo.save(teacher);
        return TeacherMapper.mapToDto(updated);
    }

    @Override
    public void deleteTeacher(Long id) {
        Teacher teacher = teacherRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(id+"Not available ..."));
        teacherRepo.deleteById(id);
    }
}
