Code Name: divesh_42_constructors

Single Constructor:

class divesh {
    divesh() {
        System.out.println("This is the default constructor of divesh class.");
    }
}
public class divesh_constructors {
    public static void main(String[] args) {
        divesh obj1 = new divesh();
    }
}
The class divesh has a single constructor defined without any parameters. When an object of divesh is created, the default constructor is automatically executed, and it prints "This is the default constructor of divesh class."

Constructor with Parameters:

class divesh {
    divesh(String s, int b) {
        System.out.println("This is the " + b + "th video of " + s);
    }
}
public class divesh_constructors {
    public static void main(String[] args) {
        divesh obj1 = new divesh("CodeWithHarry Java Playlist", 42);
    }
}
The class divesh has another constructor with two parameters, String s and int b. When an object of divesh is created with these parameters, the constructor is executed, and it prints "This is the 42th video of CodeWithHarry Java Playlist".

Constructor Overloading:

class Employee {
    // First constructor
    Employee(String s, int i) {
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }

    // Constructor overloaded
    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of the second employee is : " + salary);
    }
}
public class divesh_constructors {
    public static void main(String[] args) {
        Employee shubham = new Employee("Shubham", 1);
        Employee harry = new Employee("Harry", 2, 70000);
    }
}
The class Employee demonstrates constructor overloading. It has two constructors with different parameters. When objects of Employee are created using these constructors, the appropriate constructor is executed, and the employee details are printed accordingly.

Default Constructor with Overloaded Constructors:

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class divesh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
The class MyMainEmployee showcases constructor overloading with a default constructor and two parameterized constructors. When the object harry is created without any parameters, the default constructor is executed, and default values are set. It then prints the id and name.