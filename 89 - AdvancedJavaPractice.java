1. Code Name: DeprecatedMethod

class DeprecatedMethod {
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

public class DIV {
    public static void main(String[] args) {
        DeprecatedMethod d = new DeprecatedMethod();
        d.meth1();
    }
}

Description: This code defines a class `DeprecatedMethod` with a deprecated method `meth1`. In the `main` method, an instance of `DeprecatedMethod` is created, and the deprecated method `meth1` is called, resulting in a warning about the use of a deprecated method. The method prints "I am method 1."

2. Code Name: DeprecatedMethodWithSuppressWarnings

class DeprecatedMethodWithSuppressWarnings {
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

public class DIV {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        DeprecatedMethodWithSuppressWarnings d = new DeprecatedMethodWithSuppressWarnings();
        d.meth1();
    }
}

Description: This code is similar to the previous one but includes a `@SuppressWarnings("deprecation")` annotation to suppress the warning about using a deprecated method. It then creates an instance of `DeprecatedMethodWithSuppressWarnings` and calls the deprecated method `meth1`, which prints "I am method 1."

3. Code Name: LambdaExpression

interface LambdaExpression {
    void display();
}

public class DIV {
    public static void main(String[] args) {
        LambdaExpression i = () -> System.out.println("I am display");
        i.display();
    }
}

Description: This code defines a functional interface `LambdaExpression` with a single abstract method `display`. In the `main` method, a lambda expression is used to implement the `display` method. It creates an instance of `LambdaExpression` and calls the `display` method, which prints "I am display."

4. Code Name: GenerateMultiplicationTable

import java.io.FileWriter;
import java.io.IOException;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X" + (j + 1) + "=" + i * (j + 1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Description: This code generates a multiplication table for the number 19 and stores it in a `MultiplicationTable.txt` file. It uses a loop to calculate the multiplication results and then writes the table to the file using a `FileWriter`.

5. Code Name: DeprecatedMethodAndGenerateTable

package com.company;

import java.io.FileWriter;
import java.io.IOException;

class DeprecatedMethodAndGenerateTable {
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface LambdaExpression {
    void display();
}

public class dive {

    public static void main(String[] args) {
        // DeprecatedMethodAndGenerateTable d = new DeprecatedMethodAndGenerateTable();
        // d.meth1();

        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X" + (j + 1) + "=" + i * (j + 1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Description: This code combines the use of the deprecated method `meth1` and the multiplication table generation code. However, the deprecated method is commented out, and only the multiplication table generation part is active. It calculates and stores the multiplication table for the number 19 in the `MultiplicationTable.txt` file.