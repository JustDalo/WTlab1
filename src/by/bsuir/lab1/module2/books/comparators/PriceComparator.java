package by.bsuir.lab1.module2.books.comparators;

import by.bsuir.lab1.module2.books.Book;

import java.util.Comparator;

public class PriceComparator  implements Comparator<Book> {
    @Override
    public int compare(Book object1, Book object2) {
        return Integer.compare(object1.getPrice(), object2.getPrice());
    }
}
