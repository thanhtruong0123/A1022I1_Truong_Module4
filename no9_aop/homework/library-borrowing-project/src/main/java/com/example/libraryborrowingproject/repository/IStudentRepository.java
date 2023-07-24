package com.example.libraryborrowingproject.repository;
import com.example.libraryborrowingproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
