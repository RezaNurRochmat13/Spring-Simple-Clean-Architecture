package com.example.postgresrest.books.service;

import com.example.postgresrest.books.model.Books;
import com.example.postgresrest.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BooksService {
    @Autowired
    BooksRepository booksRepository;

    @Override
    public List<Books> findAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Books createNewBooks(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public Optional<Books> findBooksById(Integer idBooks) {
        return booksRepository.findById(idBooks);
    }

    @Override
    public Books updateBooks(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public void deleteBooks(Books books) {
        booksRepository.delete(books);
    }

    @Override
    public Page<Books> paginateBooks(Pageable pageable) {
        return booksRepository.findAll(pageable);
    }
}
