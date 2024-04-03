package com.learning.core.day1session1;

public class Book {

    private String book_title;
    private double book_price;

    private String book_description;

    public Book() {
    }

    public Book(String book_title, double book_price, String book_description) {
        this.book_title = book_title;
        this.book_price = book_price;
        this.book_description = book_description;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public String getBook_description() {
        return book_description;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }
}
