Library Management System

You are tasked with implementing a simple library management system in Java. Create a Java class named Library with the following functionalities:

The class should have an array to store available books and a counter to keep track of the number of books in the library.
Implement a constructor that initializes the array and the counter.
Create a method named addBook that takes the name of a book as a parameter and adds it to the library. Increment the counter after adding a book and print a message confirming the addition.
Create a method named showAvailableBooks that displays the list of available books in the library.
Create a method named issueBook that takes the name of a book as a parameter and marks the book as issued (null) in the library array. Print a message confirming the issuance of the book. If the book does not exist in the library, print an appropriate message.
Create a method named returnBook that takes the name of a book as a parameter and calls the addBook method to return the book to the library. Print a message confirming the return of the book.
In the sol class's main method:

Create an instance of the Library class named centralLibrary.
Add a few books to the centralLibrary using the addBook method.
Display the list of available books using the showAvailableBooks method.
Issue a book from the library using the issueBook method.
Display the list of available books again after issuing the book.
Return the issued book to the library using the returnBook method.
Display the list of available books once more after returning the book.
Implement and test the above functionalities to create a functional library management system.

// Line 1: Package declaration.
package com.company;

// Line 3: Defining a class named "Library" to manage library operations.
class Library {
    String[] books;         // Array to store available books
    int no_of_books;        // Counter to keep track of the number of books

    // Line 5-9: Constructor to initialize the Library object.
    Library() {
        this.books = new String[100]; // Initializing the array to store books
        this.no_of_books = 0;         // Initializing the counter
    }

    // Line 11-16: Method to add a book to the library.
    void addBook(String book) {
        this.books[no_of_books] = book; // Adding the book to the array
        no_of_books++;                  // Incrementing the counter
        System.out.println(book + " has been added!");
    }

    // Line 18-27: Method to display available books in the library.
    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue; // Skip if book entry is null
            }
            System.out.println("* " + book);
        }
    }

    // Line 29-42: Method to issue a book from the library.
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null; // Mark the book as issued (null)
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    // Line 44-46: Method to return a book to the library.
    void returnBook(String book) {
        addBook(book); // Adding the returned book back to the library
    }
}

// Line 49: The public class "sol" (class with the main method).
public class sol {
    // Line 50-67: The main method.
    public static void main(String[] args) {
        // Creating an instance of Library named "centralLibrary".
        Library centralLibrary = new Library();

        // Adding books to the centralLibrary.
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");

        // Displaying available books in centralLibrary.
        centralLibrary.showAvailableBooks();

        // Issuing a book from centralLibrary.
        centralLibrary.issueBook("C++");
        // Displaying available books after issuing a book.
        centralLibrary.showAvailableBooks();

        // Returning a book to centralLibrary.
        centralLibrary.returnBook("C++");
        // Displaying available books after returning a book.
        centralLibrary.showAvailableBooks();
    }
}
