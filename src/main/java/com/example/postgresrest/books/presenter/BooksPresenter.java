package com.example.postgresrest.books.presenter;

import com.example.postgresrest.books.model.Books;
import com.example.postgresrest.books.service.BookServiceImpl;
import com.example.postgresrest.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class BooksPresenter {
    @Autowired
    BookServiceImpl bookService;

    @GetMapping("books")
    public Map<String, Object> getAllBooks() {
        Map<String, Object> map = new HashMap<>();
        List<Books> booksList = bookService.findAllBooks();

        map.put("total", booksList.size());
        map.put("count", booksList.size());
        map.put("data", booksList);

        return map;
    }

    @GetMapping("books/{idBooks}")
    public Map<String, Object> getDetailBooks(@PathVariable Integer idBooks) {
        Map<String, Object> map = new HashMap<>();

        Optional<Books> booksData = Optional.ofNullable(bookService.findBooksById(idBooks)
                .orElseThrow(() -> new ResourceNotFound("Books not found with id " + idBooks)));

        map.put("data", booksData);
        return map;
    }

    @PostMapping("books")
    public Map<String, Object> createNewBooks(@Valid @RequestBody Books books) {
        Map<String, Object> map = new HashMap<>();
        bookService.createNewBooks(books);
        map.put("message", "Books created successfully");
        return map;
    }
}
