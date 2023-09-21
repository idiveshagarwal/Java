1. Code Name: FileCreation

import java.io.File;  // Importing the File class

File obj = new File("filename.txt"); // Specify the name of the file

Description: This code imports the `File` class from the `java.io` package and creates a `File` object named `obj` with the file name "filename.txt."

2. Code Name: FileCreationAndPrint

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationAndPrint {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("CodeWithDivesh is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

Description: This code creates a `File` object named `myFile` with the file name "file1.txt" and then writes some text to it using a `FileWriter`. It also prints "Data written to the file successfully." after successfully writing the data.

3. Code Name: FileReadAndPrint

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadAndPrint {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

Description: This code reads and prints the contents of the "file1.txt" file using a `Scanner`. It reads each line of the file and prints it until there are no more lines left to read.

4. Code Name: FileDeletion

import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}

Description: This code attempts to delete the "file1.txt" file. If the deletion is successful, it prints "I have deleted: file1.txt." Otherwise, it prints "Some problem occurred while deleting the file."

5. Code Name: FileOperations

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        // Code to create a new file
        /*
        File myFile = new File("file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is our first file from this java course\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        File myFile = new File("file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        // Deleting a file
        File myFile = new File("file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}

Description: This code includes operations to create, write to, read from, and delete a file named "file.txt." However, these operations are commented out, and only the file deletion part is active. It deletes the file and prints whether the deletion was successful or not.