package com.company;

public class div_ex {
    public static void main(String[] args) {
        /*
        This is the main class where you can create a library management system.
        The system is designed to issue books to students and keeps track of book information such as:
        1. Book name
        2. Book Author
        3. Who the book is issued to
        4. The date the book was issued on
        Users can add books, return issued books, and issue books to students.
        It's assumed that all users are registered with their names in a central database.
        */
    }
}

package com.company;

import java.util.ArrayList;

/*
This section defines the Book class. Each book has a name and an author.
It also includes a toString() method to display book information.
*/
class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

/*
This section defines the MyLibrary class. It contains an ArrayList of books and methods to:
- Add a book to the library
- Issue a book to a student
- Return a book to the library
*/
class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

public class div_ex7sol {
    public static void main(String[] args) {
        // Exercise 7 Solution
        ArrayList<Book> bk = new ArrayList<>();
        
        // Creating some book instances and adding them to the library
        Book b1 = new Book("Algorithms", "CLRS");
        bk.add(b1);

        Book b2 = new Book("Algorithms2", "CLRS2");
        bk.add(b2);

        Book b3 = new Book("Algorithms3", "CLRS3");
        bk.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4");
        bk.add(b4);
        
        // Creating a library and adding a new book
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "myAuthor"));
        System.out.println(l.books);
        
        // Issuing a book to a student and displaying the updated library
        l.issueBook(b3, "Divesh");
        System.out.println(l.books);
    }
}
