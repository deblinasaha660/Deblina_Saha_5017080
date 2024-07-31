package Library_Management_System;

public class Book {
    private int bId;
    private String t;
    private String a;

    public Book(int bookId, String title, String author) {
        this.bId = bookId;
        this.t = title;
        this.a = author;
    }

    public int getBookId() { return bId; }
    public String getTitle() { return t; }
    public String getAuthor() { return a; }

    @Override
    public String toString() {
        return "Book ID: " + bId + ", Title: " + t + ", Author: " + a;
    }
}
