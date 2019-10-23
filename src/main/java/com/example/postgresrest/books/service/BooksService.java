package com.example.postgresrest.books.service;

import com.example.postgresrest.books.model.Books;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    List<Books> findAllBooks();
    Books createNewBooks(Books books);
    Optional<Books> findBooksById(Integer idBooks);
}
