package com.learning.core.day1session1;

public class ManageBook extends Book {

    public static Book createBook(String book_title, double book_price){
        Book book = new Book();
        book.setBook_title(book_title);
        book.setBook_price(book_price);
        book.setBook_description(" Book Title : " + book.getBook_title() + " and price : " + book.getBook_price());
        return book;
    }

    public void showBook(Book book){
        System.out.print(book.getBook_description());
    }
}
