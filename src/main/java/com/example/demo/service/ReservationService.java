package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Client;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.ClientRepository;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Builder
public class ReservationService {

    private Book book;

    private BookRepository bookRepository;

    private Client client;

    private ClientRepository clientRepository;

    public ReservationService(Book book, BookRepository bookRepository, Client client, ClientRepository clientRepository) {
        this.book = book;
        this.bookRepository = bookRepository;
        this.client = client;
        this.clientRepository = clientRepository;
    }
}
