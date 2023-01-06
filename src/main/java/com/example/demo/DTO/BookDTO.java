package com.example.demo.DTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {

    private int bookId;
    @NotNull
    private String bookName;
    @NotNull
    private double rentPrice;
    @NotNull
    private boolean rented;

}
