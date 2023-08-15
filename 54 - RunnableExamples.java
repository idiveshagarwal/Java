class T1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running"); // Print a message when the thread runs
    }
}

This code defines a class `T1` that implements the `Runnable` interface. The `run` method contains code that will be executed when the thread is started.

public class ClassName {
    public static void main(String[] args) {
        T1 obj1 = new T1(); // Create an instance of T1
        Thread t = new Thread(obj1); // Create a new thread using the instance
        t.start(); // Start the thread
    }
}

This code defines a `main` method in the class `ClassName`. It creates an instance of `T1` and passes it to a new `Thread` object. The `start` method is called on the thread to initiate execution.

package com.company;

class MyThreadRunnable1 implements Runnable {
    public void run() {
        // Print a repetitive message in the thread's run method
    }
}

This code defines a class `MyThreadRunnable1` that implements the `Runnable` interface. The `run` method contains repetitive message printing.

class MyThreadRunnable2 implements Runnable {
    public void run() {
        // Print a repetitive message in the thread's run method
    }
}

This code defines a class `MyThreadRunnable2` that also implements the `Runnable` interface. The `run` method contains repetitive message printing similar to the previous class.

public class runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1(); // Create an instance of MyThreadRunnable1
        Thread gun1 = new Thread(bullet1); // Create a thread using the instance

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2(); // Create an instance of MyThreadRunnable2
        Thread gun2 = new Thread(bullet2); // Create another thread using the instance

        gun1.start(); // Start the first thread
        gun2.start(); // Start the second thread
    }
}

This code defines a `main` method in the class `runnable`. It creates instances of both `MyThreadRunnable1` and `MyThreadRunnable2` classes, and then creates threads for each instance. The threads are started to execute the respective `run` methods, which print repetitive messages.

Note: The repetitive message printing can be optimized by creating a loop within the `run` method to avoid code duplication.