package com.example.demo.controllers;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/books")
@CrossOrigin
public class BookController {

    private BookRepository bookRepository;
    private BookService bookService;

    public BookController(BookRepository bookRepository, BookService bookService) {
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }

    @PostMapping("/add_book")
    Book newBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }

    @GetMapping(path = "/findById/{id}")
    public ResponseEntity<Object> findByBookId(@PathVariable int id) {
        try {
            Optional<Book> bookDTO = bookRepository.findById(id);
            if (bookDTO != null) {
                return new ResponseEntity<>(bookDTO, HttpStatus.OK);
            }
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/all_books")
    public ResponseEntity<List<Book>> findAllBooks() {
        List<Book> bookList = bookRepository.findAll();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

}
