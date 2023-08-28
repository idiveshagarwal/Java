package com.company;

import java.util.*;

public class CustomLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // Adding elements to l1
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5, 77); // Inserts 77 at index 5
        System.out.println("L1 Linked list: " + l1);

        // Removing element at index 2 from l1
        l1.remove(2);
        System.out.println("L1 Linked list after removing element at index 2: " + l1);

        // Changing element at index 2 to 10 in l1
        l1.set(2, 10);
        System.out.println("L1 Linked list after changing element at index 2 to 10: " + l1);

        // Adding element 100 at the end of l1
        l1.addLast(100);
        System.out.println("L1 Linked list after inserting element 100 at the end: " + l1);

        // Adding element 0 at the beginning of l1
        l1.addFirst(0);
        System.out.println("L1 Linked list after inserting element 0 at the beginning: " + l1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        // Operations on l1
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println("Does l1 contain 27? " + l1.contains(27));
        System.out.println("Index of first occurrence of 6 in l1: " + l1.indexOf(6));
        System.out.println("Index of last occurrence of 6 in l1: " + l1.lastIndexOf(6));
        l1.set(1, 566);

        // Printing elements of l1
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            if (i < l1.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

This code demonstrates various operations on LinkedLists in Java. It covers adding, removing, changing elements, and performing other operations like checking for element presence, finding indices, and printing the elements of a linked list. The code also combines several of the given examples and provides a comprehensive example of working with LinkedLists.