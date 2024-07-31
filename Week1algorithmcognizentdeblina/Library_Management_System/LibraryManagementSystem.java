package Library_Management_System;

import Library_Management_System.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "Pride and Prejudice", "Jane Austen"));

        Book result = linearSearchByTitle(books, "1984");
        System.out.println("Linear Search Result: " + result);

        Collections.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        result = binarySearchByTitle(books, "Pride and Prejudice");
        System.out.println("Binary Search Result: " + result);
    }

    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearchByTitle(List<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

