package com.company;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);
    }
}

In this code, we're working with a HashSet and demonstrating various operations on it.

package com.company;:
Specifies the package in which the class is located.

import java.util.HashSet;:
Imports the HashSet class from the java.util package.

public class HashSetDemo {:
Defines the class named HashSetDemo.

public static void main(String[] args) {:
The main method where the execution of the program starts.

HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);:
Creates a HashSet named myHashSet of type Integer. The parameters (6, 0.5f) specify the initial capacity and load factor. The load factor determines when the set should be resized.

myHashSet.add(6);:
Adds the element 6 to the myHashSet.

myHashSet.add(8);:
Adds the element 8 to the myHashSet.

myHashSet.add(3);:
Adds the element 3 to the myHashSet.

myHashSet.add(11);:
Adds the element 11 to the myHashSet.

myHashSet.add(11);:
Adds the element 11 again. However, since sets do not allow duplicate elements, this will be ignored.

System.out.println(myHashSet);:
Prints the content of myHashSet using System.out.println.

}:
Closes the main method.

}:
Closes the class definition.

Output:

[8, 3, 11, 6]
This code demonstrates the creation of a HashSet, adding elements to it, and printing its content. The HashSet ensures that duplicate elements are not allowed, and the order of elements is not guaranteed to be in the order they were added.