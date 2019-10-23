package com.example.postgresrest.books.service;

import com.example.postgresrest.books.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    List<Books> findAllBooks();
    Books createNewBooks(Books books);
    Optional<Books> findBooksById(Integer idBooks);
    Books updateBooks(Books books);
    void deleteBooks(Books books);

    Page<Books> paginateBooks(Pageable pageable);
}
