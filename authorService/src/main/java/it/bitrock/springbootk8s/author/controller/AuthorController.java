package it.bitrock.springbootk8s.author.controller;

import it.bitrock.springbootk8s.author.model.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @GetMapping
    public List<Author> findAll() {
        var authors = List.of(
                new Author(1L, "David", "Host"),
                new Author(2L, "Jim", "Bull"),
                new Author(3L, "Mark", "Fix")
                );

        return authors;
    }
}
