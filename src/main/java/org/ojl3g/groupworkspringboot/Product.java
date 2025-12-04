package org.ojl3g.groupworkspringboot;

import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private double price;
    private LocalDate expiryDate; //Срок годности до (localdate)

    public Product(Long id, String name, double price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
