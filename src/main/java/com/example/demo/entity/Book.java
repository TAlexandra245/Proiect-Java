package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
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

    @Column(name = "rented")
    @NotNull
    private boolean rented;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "book")
    private List<Reservation> reservations;
}
