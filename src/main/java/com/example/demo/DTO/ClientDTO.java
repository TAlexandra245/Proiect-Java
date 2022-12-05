package com.example.demo.DTO;

import com.example.demo.entity.Book;
import com.example.demo.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {

    private Integer clientId;
    private String firstName;
    private String lastName;
    private String email;
}
