package org.ojl3g.groupworkspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Product {
    private long id;
    private String name;
    private double price;
    private LocalDate expiryDate; //Срок годности до (localdate)
}
