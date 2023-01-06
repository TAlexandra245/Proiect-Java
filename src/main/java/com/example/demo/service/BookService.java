package com.example.demo.service;

import com.example.demo.DTO.BookDTO;
import com.example.demo.Enums.BookAvailability;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Book deleteById(int id) {
        Optional<Book> searchedBook = bookRepository.findById(id);
        if(searchedBook.isPresent()) {
            bookRepository.deleteById(id);
        }
        return null;
    }
}
