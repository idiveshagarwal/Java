Code Name: custom_class

This Java code defines a custom class named Employee with attributes id, salary, and name. It also includes methods to print the details of an employee and to get their salary.

Class Employee:

class Employee {
    int id;         // Attribute 1
    int salary;     // Attribute 2
    String name;    // Attribute 3

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}
This class Employee has three attributes: id, salary, and name. It also contains two methods: printDetails() to print the id and name of an employee and getSalary() to get the salary of an employee.

main method:

public static void main(String[] args) {
    System.out.println("This is our custom class");
    Employee divesh = new Employee(); // Instantiating a new Employee Object
    Employee john = new Employee(); // Instantiating a new Employee Object

    // Setting Attributes for divesh
    divesh.id = 12;
    divesh.salary = 34;
    divesh.name = "CodeWithdivesh";

    // Setting Attributes for John
    john.id = 17;
    john.salary = 12;
    john.name = "John Khandelwal";

    // Printing the Attributes
    divesh.printDetails();
    john.printDetails();
    int salary = john.getSalary();
    System.out.println(salary);
}
In the main method, two Employee objects (divesh and john) are created using the new keyword. Their attributes are set with specific values. Then, the printDetails() method is called on both objects to print their respective details. Finally, the getSalary() method is called on the john object to get and print his salary.

Output:

This is our custom class
My id is 12
and my name is CodeWithdivesh
My id is 17
and my name is John Khandelwal
12
The output shows the details of both employees (divesh and John) along with John's salary. The custom class Employee successfully stores and displays information about employees.