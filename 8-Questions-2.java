package com.company;

public class floating_point_value {
    public static void main(String[] args) {
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);
    }
}

package com.company;

public class character_manipulation {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}

package com.company;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a > 8);
        System.out.println(7 * 49 / 7 + 35 / 7);
    }
}
