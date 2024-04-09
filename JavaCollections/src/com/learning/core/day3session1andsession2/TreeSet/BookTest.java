package com.learning.core.day3session1andsession2.TreeSet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class BookTest {
    public static void main(String[] args) throws ParseException {
        TreeSet<Book> book = new TreeSet<>();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        book.add(new Book(1001,"PythonLearning",715.0,"Matric c. Brown",date.parse("02/02/2020")));
        book.add(new Book(1002,"Modern Mainframe",295.0,"Sharad",date.parse("19/05/1997")));
        book.add(new Book(1003,"Java Programming",523.0,"Gilad branch",date.parse("23/11/2019")));
        book.add(new Book(1004,"read C++",295.0,"Henry Harvin",date.parse("19/11/2019")));
        book.add(new Book(1005,".Net Platform",3497.0,"Mark j. Price",date.parse("06/03/1984")));




        Iterator<Book> bookIterator = book.iterator();
        while (bookIterator.hasNext()){
            Book book1 = bookIterator.next();
            System.out.println(book1.getBookId() + " " + book1.getTitle() + " " + book1.getPrice() + " " + book1.getPublication() + " " + date.format(book1.getDate()));
        }
        TreeSet<Book> bookSetSortedByName = new TreeSet<>(Comparator.comparing(Book::getTitle));
        bookSetSortedByName.addAll(book);

        for (Book book1 : bookSetSortedByName) {
            System.out.println(book1.getTitle());
        }
    }
}
