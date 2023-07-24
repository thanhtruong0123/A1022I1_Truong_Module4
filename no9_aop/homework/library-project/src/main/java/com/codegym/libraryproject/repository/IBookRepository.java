package com.codegym.libraryproject.repository;

import com.codegym.libraryproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
