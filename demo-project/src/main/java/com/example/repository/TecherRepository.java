package com.example.repository;

import com.example.modal.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecherRepository extends JpaRepository<Teacher,Long> {
}
