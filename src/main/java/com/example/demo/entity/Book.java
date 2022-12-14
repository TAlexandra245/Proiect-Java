package com.example.demo.entity;

import com.example.demo.Enums.BookAvailability;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ISBN;

    @Column(name = "book_name", length = 100)
    @NotNull
    private String bookName;

    @Column(name = "rent_price")
    @NotNull
    private double rentPrice;

    @Column(name ="book_availability")
    @NotNull
    BookAvailability bookAvailability;

    @Column(name = "local_date")
    @NotNull
    private LocalDate localDate;

    @Column(name = "penalty")
    @NotNull
    private float penalty;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "book")
    private List<Reservation> reservations;
}
