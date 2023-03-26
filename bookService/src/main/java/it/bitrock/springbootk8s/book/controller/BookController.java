package it.bitrock.springbootk8s.book.controller;

import it.bitrock.springbootk8s.book.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> findAll() {
        var books = List.of(
                new Book(1L, "Spring boot microservices", 1L),
                new Book(1L, "Kubernetes for Spring Boot developers", 2L),
                new Book(1L, "Java for microservices", 3L),
                new Book(1L, "Cloud architectires", 3L)
                );

        return books;
    }
}
