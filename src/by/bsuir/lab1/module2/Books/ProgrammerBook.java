package by.bsuir.lab1.module2.Books;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof ProgrammerBook) || !super.equals(object)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) object;
        return level == programmerBook.level &&
                Objects.equals(programmerBook.language, this.language);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString(){
        String returnString = super.toString();
        returnString = returnString + language;
        return returnString;
    }
}
