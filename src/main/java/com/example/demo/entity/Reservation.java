package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idReservation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "rent_date")
    @NotNull
    private LocalDate rentDate;

    @Column(name = "return_date")
    @NotNull
    private LocalDate returnDate;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Client client;

}
