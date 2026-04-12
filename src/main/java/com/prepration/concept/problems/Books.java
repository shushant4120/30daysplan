package com.prepration.concept.problems;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Books {

    private String name;
    private String author;
    private double price;
    private String genre;

    public Books(String name, String author, double price, String genre) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }
}
