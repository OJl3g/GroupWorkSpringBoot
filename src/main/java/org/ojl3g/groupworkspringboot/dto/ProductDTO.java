package org.ojl3g.groupworkspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private long id;
    private String name;
    private double price;
    private LocalDate expiryDate;
}
