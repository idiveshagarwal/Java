public class break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops!

        // Code Segment 1:
//        for (int i = 0; i < 50; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

        // Code Segment 2:
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        } while (i < 5);
//        System.out.println("Loop ends here");

        // Code Segment 3:
//        for (int i = 0; i < 50; i++) {
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }

        // Code Segment 4:
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        } while (i < 5);
        System.out.println("Loop ends here");
    }
}

In the given code:

Code Segment 1 and 2 demonstrate the use of the break statement. The break statement is used to terminate a loop prematurely. In Segment 1, a for loop is used with a condition to print numbers from 0 to 49. When i becomes 2, the break statement is encountered, which exits the loop immediately. In Segment 2, a do-while loop is used with a similar functionality.

Code Segment 3 and 4 demonstrate the use of the continue statement. The continue statement is used to skip the current iteration and proceed to the next iteration of the loop. In Segment 3, a for loop is used to print numbers from 0 to 49, but when i is 2, the continue statement skips the rest of the loop's body for that iteration. In Segment 4, a do-while loop is used with a similar functionality.

In all code segments, the output will display the respective numbers being printed along with the message "Java is great". Additionally, for specific cases (as mentioned in the comments), there will be an additional message, such as "Ending the loop" in Code Segments 1 and 4, and "Loop ends here" at the end of each code segment. The actual output for each code segment will be displayed accordingly when the code is executed.