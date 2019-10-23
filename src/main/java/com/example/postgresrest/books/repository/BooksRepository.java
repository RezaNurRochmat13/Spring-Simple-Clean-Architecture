package com.example.postgresrest.books.repository;


import com.example.postgresrest.books.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> { }
