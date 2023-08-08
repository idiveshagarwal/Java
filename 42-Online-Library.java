package com.company;
Question:
public class online_library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        //
    }
}

Solution:

package com.company;

import java.util.ArrayList; // Import the ArrayList class to use for storing books

public class Library {
    private ArrayList<String> availableBooks; // Array to store available books
    private ArrayList<String> issuedBooks;    // Array to store issued books

    public Library() {
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    // Method to add a book to the available books list
    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println(bookTitle + " has been added to the library.");
    }

    // Method to issue a book from the available books list
    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println(bookTitle + " has been issued.");
        } else {
            System.out.println(bookTitle + " is not available in the library.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println(bookTitle + " has been returned.");
        } else {
            System.out.println(bookTitle + " was not issued from this library.");
        }
    }

    // Method to display the available books
    public void showAvailableBooks() {
        System.out.println("Available books in the library:");
        for (String book : availableBooks) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding sample books to the library
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Issuing and returning sample books
        library.issueBook("Book 1");
        library.returnBook("Book 2");

        // Displaying available books
        library.showAvailableBooks();
    }
}
This code defines a Java class named Library with methods to perform the specified operations: adding books, issuing books, returning books, and showing available books. It uses ArrayList to store the books, making it more flexible and easier to manage compared to arrays. The main method demonstrates how to use these methods and displays sample output.