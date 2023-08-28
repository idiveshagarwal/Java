package com.company;

import java.util.*;

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        
        // Adding elements to l2
        l2.add(15);
        l2.add(18);
        l2.add(19);
        
        // Adding elements to l1
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5); // Adding 5 at index 0
        l1.add(0, 1); // Adding 1 at index 0
        l1.addAll(0, l2); // Adding all elements of l2 at index 0 of l1
        l1.addLast(676); // Adding 676 at the end of l1
        l1.addFirst(788); // Adding 788 at the beginning of l1
        
        // Checking if 27 is present in l1
        System.out.println(l1.contains(27));
        
        // Finding the index of the first occurrence of 6 in l1
        System.out.println(l1.indexOf(6));
        
        // Finding the index of the last occurrence of 6 in l1
        System.out.println(l1.lastIndexOf(6));
        
        // Changing the element at index 1 to 566
        l1.set(1, 566);
        
        // Printing the elements of l1
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            if (i < l1.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

This code demonstrates various operations on LinkedLists in Java. It creates two LinkedLists l1 and l2, performs operations like adding elements, checking for element presence, finding indices, changing elements, and printing the elements of l1. It showcases how to use the methods available in the LinkedList class to manipulate and access the elements of a linked list.