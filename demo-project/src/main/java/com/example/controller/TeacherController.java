package com.example.controller;

import com.example.dto.Dto;
import com.example.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class TeacherController {

    TeacherService teacherService;

    @PostMapping("/saveTeacher")
    public ResponseEntity<Dto> saveTeacher(@RequestBody Dto dto){
        Dto saveDato = teacherService.createTeacher(dto);
        return new ResponseEntity<>(saveDato, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Dto> getTeacherBy(@PathVariable Long id){
        Dto dto = teacherService.getTeacherById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Dto>> getAllTeachers(){
        List<Dto> tea = teacherService.getAll();
        return ResponseEntity.ok(tea);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Dto> updateEmployee(@PathVariable Long id,
                                              @RequestBody Dto dto){
        Dto dto1 =teacherService.updateTeacher(id,dto);
        return ResponseEntity.ok(dto1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBy(@PathVariable Long id){
        teacherService.deleteTeacher(id);
        return ResponseEntity.ok("Employee deleted ...");
    }
}
