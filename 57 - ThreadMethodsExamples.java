Code 1: Using Thread.sleep()**

import java.io.*;
import java.lang.Thread;

public class dive {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000); // Pausing the thread for 2000 milliseconds (2 seconds)
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

Question:

**Understanding Thread.sleep()**

You are tasked with creating a Java program to demonstrate the use of the `Thread.sleep()` method. Follow these steps:

1. Create a class named `dive` with a `main` method.
2. Inside the `main` method:
   - Use a loop to iterate from 1 to 5.
   - Use the `Thread.sleep(2000)` method to pause the thread for 2000 milliseconds (2 seconds) in each iteration.
   - Print the value of `i` after resuming the thread.

Compile and run the program to observe how the `Thread.sleep()` method works to introduce delays in the program's execution.

Code 2: Using Thread.interrupt()**

class dive1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread is running");
    }
}

public class dive extends Thread {
    public static void main(String[] args) {
        dive1 t = new dive1();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");
    }
}
```

Question:

**Understanding Thread.interrupt()**

Create a Java program that demonstrates the use of the `Thread.interrupt()` method. Follow these steps:

1. Create a class named `dive1` extending `Thread`.
2. Inside the `run` method of `dive1`:
   - Use a loop to print "Child Thread" multiple times.
   - Use `Thread.sleep(4000)` to put the child thread to sleep for 4 seconds.
   - Catch the `InterruptedException` that occurs when the main thread interrupts the child thread using `t.interrupt()`.
   - Print "Child Thread Interrupted".
   - Print "Thread is running" after the catch block.
3. Create a class named `dive` (main class).
4. Inside the `main` method of `dive`:
   - Create an instance `t` of `dive1`.
   - Start the child thread using `t.start()`.
   - Interrupt the child thread using `t.interrupt()`.
   - Print "Main Thread".

Compile and run the program to observe the behavior of interrupting a thread and handling `InterruptedException`.

**Code 3: Using Thread.join()**

package com.company;

class MyNewThr1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thank you: ");
        }
    }
}

public class thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        t2.start();
    }
}
```

Question:

**Understanding Thread.join()**

You are required to create a Java program to understand the use of the `Thread.join()` method. Follow these steps:

1. Create a package named `com.company`.
2. Create two classes `MyNewThr1` and `MyNewThr2` within the package, both extending `Thread`.
3. In the `run` method of `MyNewThr1`:
   - Use a loop to print "Thank you" indefinitely.
   - Use `Thread.sleep(455)` to introduce a delay of 455 milliseconds.
4. In the `run` method of `MyNewThr2`:
   - Use a loop to print "My Thank you" indefinitely.
5. In the `thread_methods` class (main class):
   - Create instances `t1` and `t2` of `MyNewThr1` and `MyNewThr2`, respectively.
   - Start both threads using `t1.start()` and `t2.start()`.

Compile and run the program to observe how multiple threads run concurrently and produce output.