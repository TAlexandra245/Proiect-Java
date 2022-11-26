package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Builder
public class BookService {

    private Book book;

    private BookRepository bookRepository;

    public BookService(Book book, BookRepository bookRepository) {
        this.book = book;
        this.bookRepository = bookRepository;
    }


}
