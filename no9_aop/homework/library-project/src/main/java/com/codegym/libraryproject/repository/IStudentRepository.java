package com.codegym.libraryproject.repository;

import com.codegym.libraryproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
