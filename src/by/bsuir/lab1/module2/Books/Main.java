package by.bsuir.lab1.module2.Books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("BookTitle1", "Author1", 1);
        Book book2 = new Book("BookTitle2", "Author2", 2);
        Book book3 = new Book("BookTitle1", "Author1", 1);
        Book book4 = null;
        System.out.println(book1.toString());
        System.out.println(book1.equals(book4));

        
    }
}
