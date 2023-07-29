package com.example.libraryproject2.repository;

import com.example.libraryproject2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM book WHERE name = :name", nativeQuery = true)
    Book getBookByName(@Param("name") String name);
}
