package com.company;

public class string_methods {
    public static void main(String[] args) {
        String name = "Divesh";
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     Divesh     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('v', 'p'));
        //System.out.println(name.replace("e", "ier"));

        //System.out.println(name.startsWith("Div"));
        //System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "Diveesheshesh";
        //System.out.println(modifiedName.indexOf("esh"));
        //System.out.println(modifiedName.indexOf("esh", 4));
        //System.out.println(modifiedName.lastIndexOf("esh", 7));

        //System.out.println(name.equals("Divesh"));
        System.out.println(name.equalsIgnoreCase("DivESH"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}
