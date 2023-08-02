Code Name: divesh_40_ch9

Class Employee:

class Employee {
    private int id;
    private String name;

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
The Employee class defines private attributes id and name. It provides public getter and setter methods to access and modify the name attribute. It also provides a public method to set the id attribute and another method to get the id attribute.

Class divesh (Main class):

public class divesh {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());

        emp1.setId(1);
        System.out.println(emp1.getId());
    }
}
The divesh class is the main class where the main method is defined. It creates an instance of the Employee class named emp1 and uses its setter and getter methods to set and retrieve the name and id attributes.

Output:

Shubham
1
The output shows that the name "Shubham" was successfully set using the setName() method and retrieved using the getName() method. Similarly, the id "1" was successfully set using the setId() method and retrieved using the getId() method.

Class MyEmployee:

package com.company;

class MyEmployee {
    private int id;
    private String name;

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
The MyEmployee class is similar to the Employee class but has a different name and is defined within the com.company package.

Main class divesh_40_ch9 (Same as class divesh above):

public class divesh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

        harry.setId(234);
        System.out.println(harry.getId());
    }
}
The divesh_40_ch9 class is the same as the divesh class, but the name of the MyEmployee class is used instead. It creates an instance of MyEmployee named harry and sets/gets the name and id attributes in the same way as shown in the output.

Note: In both cases, the private access modifier ensures that the id and name attributes cannot be accessed directly from outside the class. Instead, they are accessed through public getter and setter methods.