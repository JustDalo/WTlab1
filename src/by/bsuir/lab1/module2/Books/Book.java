package by.bsuir.lab1.module2.Books;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public static void setEdition(int value){
        edition = value;
    }

    public static int getEdition(){
        return  edition;
    }

    @Override
    public String toString() {
        return author + " ( " + title + " ) ";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        else if (!(object instanceof Book)) {
            return false;
        }

        Book book = (Book) object;
        return price == book.price
                && (title == book.title || title != null && title.equals(book.getTitle()))
                && (author == book.author || author != null && author.equals(book.getAuthor()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.price);
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }
}
