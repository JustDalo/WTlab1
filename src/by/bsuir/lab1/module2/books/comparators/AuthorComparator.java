package by.bsuir.lab1.module2.books.comparators;

import by.bsuir.lab1.module2.books.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book object1, Book object2) {
        return object1.getAuthor().compareTo(object2.getAuthor());
    }
}
