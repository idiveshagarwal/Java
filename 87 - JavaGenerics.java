1. Code Name: WithoutGenerics

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        // Without Java Generics:

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  // Integer value
        myArrayList.add("Divesh Bhai!"); // String value
        myArrayList.add(20.4); // Double value
        System.out.println(myArrayList);
    }
}

Description: This code demonstrates the use of an ArrayList without Java Generics. It creates an ArrayList named `myArrayList` and adds an Integer, a String, and a Double to it. Finally, it prints the contents of the ArrayList.

2. Code Name: WithGenericsError

import java.util.ArrayList;

public class WithGenericsError {
    public static void main(String[] args) {
        // With Java Generics:

        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);  // Integer value
        myArrayList.add("Divesh Bhai!"); // String value (error)
        myArrayList.add(20.4); // Double value (error)
        System.out.println(myArrayList);
    }
}

Description: This code attempts to use Java Generics with an ArrayList, specifying that it will contain Integer elements. However, it mistakenly adds a String and a Double, resulting in compilation errors due to type incompatibility.

3. Code Name: WithoutGenericsGetError

import java.util.ArrayList;

public class WithoutGenericsGetError {
    public static void main(String[] args) {
        // Without Java Generics:

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  // Integer value
        myArrayList.add("Divesh Bhai!"); // String value
        myArrayList.add(20.4); // Double value

        int x = myArrayList.get(0); // Error: Cannot convert Object to int
        System.out.println(x);
    }
}

Description: This code demonstrates the use of an ArrayList without Java Generics. It adds an Integer, a String, and a Double to the ArrayList. However, when trying to retrieve the first element with `myArrayList.get(0)`, it results in an error because the retrieved object cannot be directly cast to an int.

4. Code Name: WithoutGenericsTypeCast

import java.util.ArrayList;

public class WithoutGenericsTypeCast {
    public static void main(String[] args) {
        // Without Java Generics:

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  // Integer value
        myArrayList.add("Divesh Bhai!"); // String value
        myArrayList.add(20.4); // Double value

        int x = (int) myArrayList.get(0); // Object typecasted into an integer
        System.out.println(x);
    }
}

Description: This code is similar to the previous one but demonstrates how to perform explicit typecasting of an Object to an int when retrieving the first element from the ArrayList.

5. Code Name: WithGenerics

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        // With Java Generics:

        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);

        int x = myArrayList.get(0);
        System.out.println(x);
    }
}

Description: This code correctly uses Java Generics with an ArrayList, specifying that it will contain Integer elements. It adds several Integer values to the ArrayList and successfully retrieves and prints the first element.

6. Code Name: MyGenericExample

package com.company;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class MyGenericExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(54);
        arrayList.add(643);

        int a = (int) arrayList.get(0);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}

Description: This code defines a generic class `MyGeneric` that takes two type parameters, `T1` and `T2`, and has methods to access and modify these parameters. It then creates an ArrayList of Integers, adds integers to it, retrieves and prints an integer. It also demonstrates the use of the `MyGeneric` class with different types for `T1` and `T2`, showing how to create an instance, set values, and retrieve and display those values.