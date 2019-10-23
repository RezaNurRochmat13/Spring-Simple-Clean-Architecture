package com.example.postgresrest.books.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;

@Entity
@Table(name = "books")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "books_name")
    private String booksName;

    @Column(name = "books_author")
    private String booksAuthor;

    @Column(name = "books_description")
    private String booksDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getBooksAuthor() {
        return booksAuthor;
    }

    public void setBooksAuthor(String booksAuthor) {
        this.booksAuthor = booksAuthor;
    }

    public String getBooksDescription() {
        return booksDescription;
    }

    public void setBooksDescription(String booksDescription) {
        this.booksDescription = booksDescription;
    }
}
