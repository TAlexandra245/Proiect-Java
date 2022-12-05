package com.example.demo.DTO;

import com.example.demo.entity.Book;
import com.example.demo.entity.Client;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDTO {

    private Integer id;

    @NotNull
    private Book book;

    @NotNull
    private Client client;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate returnDate;

    @NotNull
    private boolean returned;

    @NotNull
    private float penalty;
}
