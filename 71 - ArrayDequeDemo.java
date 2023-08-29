Sure, I can provide you with a complete code example and explain each part of it. Here's the code using `ArrayDeque`:

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Creating an ArrayDeque instance of Integer type
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);

        // Adding an element at the beginning of the ArrayDeque
        ad1.addFirst(5); // Adds 5 at the beginning
        ad1.offerFirst(10); // Offers 10 at the beginning

        // Printing the ArrayDeque
        System.out.println("ArrayDeque content: " + ad1);

        // Getting the first element from the ArrayDeque
        int firstElement = ad1.getFirst();
        System.out.println("First element: " + firstElement);

        // Getting the last element from the ArrayDeque
        int lastElement = ad1.getLast();
        System.out.println("Last element: " + lastElement);
    }
}

Explanation of the code:

1. Import Statement:
   The `import java.util.ArrayDeque;` statement imports the `ArrayDeque` class from the `java.util` package, allowing us to use it in our code.

2. `public class ArrayDequeDemo`:
   Defines the class named `ArrayDequeDemo`.

3. `public static void main(String[] args)`:
   The main method, where the execution of the program starts.

4. Creating an `ArrayDeque` Instance:

   ArrayDeque<Integer> ad1 = new ArrayDeque<>();

   This line creates an instance of `ArrayDeque` called `ad1`. We specify the type `Integer` in angle brackets to indicate that this `ArrayDeque` will hold elements of the `Integer` type.

5. Adding Elements to the `ArrayDeque`:

   ad1.add(6);
   ad1.add(56);
   ad1.add(9);

   Here, we add elements 6, 56, and 9 to the `ArrayDeque` `ad1` using the `add` method.

6. Adding Elements at the Beginning:
   ad1.addFirst(5);
   ad1.offerFirst(10);
   These lines add elements 5 and 10 at the beginning of the `ArrayDeque` using the `addFirst` and `offerFirst` methods, respectively.

7. Printing the `ArrayDeque`:
   System.out.println("ArrayDeque content: " + ad1);
   This line prints the content of the `ArrayDeque` using `System.out.println`.

8. Getting the First and Last Elements:
   int firstElement = ad1.getFirst();
   int lastElement = ad1.getLast();
   These lines retrieve the first and last elements from the `ArrayDeque` using the `getFirst` and `getLast` methods, respectively.

9. Printing the First and Last Elements:
   System.out.println("First element: " + firstElement);
   System.out.println("Last element: " + lastElement);
   These lines print the retrieved first and last elements.

In summary, this code demonstrates the basic usage of the `ArrayDeque` class. It creates an `ArrayDeque`, adds elements to it, adds elements at the beginning, prints the content, and retrieves and prints the first and last elements.