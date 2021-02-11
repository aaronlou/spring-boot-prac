package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reader;
    private String isbn;
    private String author;
    private String description;
    private String title;

//    public Book(Long id, String reader, String isbn, String title, String author, String description) {
//        this.id = id;
//        this.reader = reader;
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.description = description;
//    }
//
    public Book() {

    }

    public Long getId() {
        return id;
    }

    public String getReader() {
        return reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

