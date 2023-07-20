Q-1: Print the following pattern:

**
*

// Practice Problem 1
for (int i = 4; i > 0; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.print("\n");
}

Q-2: Find the sum of the first 4 even numbers.

// Practice Problem 2
int sum = 0;
int n = 4;
for (int i = 0; i < n; i++) {
    sum = sum + (2 * i);
}
System.out.print("Sum of even numbers is: ");
System.out.println(sum);

Q-3: Generate the multiplication table of a number (e.g., 5) up to 10.

// Practice Problem 3
int n = 5;
for (int i = 1; i <= 10; i++) {
    System.out.printf("%d X %d = %d\n", n, i, n * i);
}

Q-4: Generate the reverse multiplication table of a number (e.g., 10) down from 10 to 1.

// Practice Problem 4
int n = 10;
for (int i = 10; i >= 1; i--) {
    System.out.printf("%d X %d = %d\n", n, i, n * i);
}

Q-6: Calculate the factorial of a number (e.g., 5).

// Practice Problem 6
int n = 5;
int i = 1;
int factorial = 1;
while (i <= n) {
    factorial *= i;
    i++;
}
System.out.println(factorial);

Q-7: Calculate the sum of the first 10 multiples of a number (e.g., 8).

// Practice Problem 9
int n = 8;
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += n * i;
}
System.out.println(sum);

The code contains several practice problems, each commented out. To execute a specific problem, you can uncomment the corresponding block of code and run the main method. Each problem description and the logic to solve it are provided in the comments above the code blocks.