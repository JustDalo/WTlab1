package by.bsuir.lab1.module2.Books;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("BookTitle1", "Author1", 1);
        Book book2 = new Book("BookTitle2", "Author2", 2);
        Book book3 = new Book("BookTitle1", "Author1", 1);
        Book book4 = null;
        System.out.println(book1.toString());
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());

        ProgrammerBook programmerBook1 = new ProgrammerBook("ProgrammerTitle1", "ProgrammerAuthor1", 4, "Java",1);
        ProgrammerBook programmerBook2 = new ProgrammerBook("ProgrammerTitle2", "ProgrammerAuthor2", 5, "Java",1);

        System.out.println(programmerBook1.toString());
        System.out.println(programmerBook1.equals(programmerBook2));
        System.out.println(programmerBook1.hashCode());


    }
}
