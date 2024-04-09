package com.learning.core.day3session1andsession2.TreeSet;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private int bookId;
    private String title;
    private double price;
    private String publication;
    private Date date;

    public Book() {
    }

    public Book(int bookId, String title, double price, String publication, Date date) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publication = publication;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(publication, book.publication) && Objects.equals(date, book.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, publication, date);
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publication='" + publication + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.bookId, o.bookId);
    }
}
