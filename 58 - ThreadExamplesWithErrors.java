**Code 1: Basic Thread Example**

import java.util.ArrayList;

class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class dive {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

Question:

**Understanding Basic Thread Execution**

You are required to create Java programs to demonstrate basic multithreading concepts. Follow these steps:

1. Create a class named `Thread1` that extends `Thread`.
   - In the `run` method of `Thread1`, use an infinite loop to print "Welcome" repeatedly.
2. Create a class named `Thread2` that also extends `Thread`.
   - In the `run` method of `Thread2`, use an infinite loop to print "Good morning" repeatedly.
3. In the `dive` class (main class):
   - Create instances `t1` and `t2` of `Thread1` and `Thread2`.
   - Start both threads using `t1.start()` and `t2.start()`.

Compile and run the program to observe how multiple threads run concurrently and produce output.

**Code 2: Thread Sleep and Error Handling**

import java.util.ArrayList;

class Thread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}

public class dive {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

Question:

**Understanding Thread Sleep and Error Handling**

Create a Java program that demonstrates thread sleep and error handling. Follow these steps:

1. Create classes `Thread1` and `Thread2` similar to the previous code.
2. Modify the `run` method of `Thread1`:
   - Use `Thread.sleep(200)` to pause the thread for 200 milliseconds.
   - Catch the `InterruptedException` that can occur when the thread is interrupted during sleep.
   - Print the stack trace using `e.printStackTrace()` inside the catch block.
3. The `run` method of `Thread2` remains the same.
4. In the `dive` class (main class):
   - Create instances `t1` and `t2` of `Thread1` and `Thread2`.
   - Start both threads using `t1.start()` and `t2.start()`.

Compile and run the program to observe the effects of thread sleep and error handling during thread execution.

**Code 3: Thread Priority**

import java.util.ArrayList;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Welcome");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}

public class dive {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}

Question:

**Understanding Thread Priority**

Create a Java program that demonstrates thread priority. Follow these steps:

1. Create classes `Thread1` and `Thread2` similar to the previous code.
2. In the `dive` class (main class):
   - Create instances `t1` and `t2` of `Thread1` and `Thread2`.
   - Start both threads using `t1.start()` and `t2.start()`.
   - Set the priority of `t1` to 5 using `t1.setPriority(5)`.
   - Set the priority of `t2` to 1 using `t2.setPriority(1)`.
   - Print the priorities of `t1` and `t2` using `t1.getPriority()` and `t2.getPriority()`.

Compile and run the program to observe how thread priorities affect the execution order of threads.

**Code 4: Thread State**

package com.company;

class Practice13 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}

class Practice13b extends Thread {
    public void run() {
        // Code commented out for this example
    }
}

public class practice {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

Question:

**Understanding Thread State**

Create a Java program that demonstrates thread state. Follow these steps:

1. Create a package named `com.company`.
2. Inside the package, create classes `Practice13` and `Practice13b` both extending `Thread`.
3. In the `run` method of `Practice13`:
   - Use an infinite loop to print "Good Morning!".
4. Comment out the code in the `run` method of `Practice13b`.
5. In the `practice` class (main class):
   - Create instances `p1` and `p2` of `Practice13` and `Practice13b`.
   - Print the priorities of `p1` and `p2` using `p1.getPriority()` and `p2.getPriority()`.
   - Print the initial state of `p2` using `p2.getState()`.
   - Start the `p2` thread using `p2.start()`.
   - Print the state of `p2` after starting.
   - Print the state of the current thread using `Thread.currentThread().getState()`.

Compile and run the program to observe thread states and how they change during execution.