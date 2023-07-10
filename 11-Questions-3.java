package com.company;

public class questions {
    public static void main(String[] args) {
        // Problem 1: The lines demonstrate converting a string to lowercase using the toLowerCase() method.
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        // Problem 2: The lines demonstrate replacing spaces in a string with underscores using the replace() method.
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3: The lines replace an empty string ("") in the letter string with "Sachin" using the replace() method. The modified letter string is then printed.
        String letter = "Dear , Thanks a lot!";
        letter = letter.replace("", "Sachin");
        System.out.println(letter);

        // Problem 4: The lines search for the occurrences of double spaces (" ") and triple spaces (" ") in the myString string using the indexOf() method. The indices of the first occurrence are printed.
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5: The lines demonstrate the usage of escape sequences, including a newline character (\n) and a tab character (\t), in the myLetter string. The string is printed, displaying the formatted output.
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
