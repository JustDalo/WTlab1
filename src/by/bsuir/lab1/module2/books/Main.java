package by.bsuir.lab1.module2.books;

import by.bsuir.lab1.module2.books.comparators.AuthorComparator;
import by.bsuir.lab1.module2.books.comparators.PriceComparator;
import by.bsuir.lab1.module2.books.comparators.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("BookTitle1", "Author1", 100, 1);
        Book book2 = new Book("BookTitle2", "Author2", 200, 3);
        Book book3 = new Book("BookTitle3", "Author3", 150,2);
        Book book4 = null;
        System.out.println(book1.toString());
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());

        ProgrammerBook programmerBook1 = new ProgrammerBook("ProgrammerTitle1", "ProgrammerAuthor1", 4, 1,"Java",1);
        ProgrammerBook programmerBook2 = new ProgrammerBook("ProgrammerTitle2", "ProgrammerAuthor2", 5, 2,"Java",1);

        System.out.println(programmerBook1.toString());
        System.out.println(programmerBook1.equals(programmerBook2));
        System.out.println(programmerBook1.hashCode());

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.sort(Book::compareTo);

        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = authorTitleComparator.thenComparing(new PriceComparator());

        list.sort(authorTitlePriceComparator);
        for (var  book: list) {
            System.out.print(book + " ");
        }

    }
}
