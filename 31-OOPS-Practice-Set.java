Code Name: practice_set

This Java code defines four classes: Employee, CellPhone, Square, and Tommy, each serving a specific purpose:

Class Employee:

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
The Employee class represents an employee with attributes salary and name. It provides methods to get the salary and name of the employee (getSalary() and getName()), as well as to set the name of the employee (setName(String n)).

Class CellPhone:

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Mukul...");
    }
}
The CellPhone class simulates a cellphone and provides methods to ring, vibrate, and call a friend.

Class Square:

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}
The Square class represents a square with an attribute side. It provides methods to calculate the area and perimeter of the square (area() and perimeter()).

Class Tommy:

class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}
The Tommy class represents a character named Tommy and provides methods to hit, run, and fire.

In the main method, specific instances of these classes are created to perform certain actions based on the problem numbers. The code is organized using comments to represent different problem scenarios.

Problem 5:

Tommy player1 = new Tommy();
player1.fire();
player1.run();
player1.hit();
In this problem, a Tommy object named player1 is created, and methods fire(), run(), and hit() are called on it. The output will show messages for each action performed by Tommy.

Note: The code is currently commented out for the previous problems (1 to 3), and only Problem 5 is executed in the main method. You can uncomment the desired problems to execute them and observe their respective outputs.