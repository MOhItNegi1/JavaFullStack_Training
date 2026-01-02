package constructor;


class Address {
    String city;

    // Parameterized constructor
    Address(String city) {
        this.city = city;
    }
}

// Employee class
class Employee {
    int id;
    Address address;

    // Parameterized constructor
    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Copy constructor (shallow copy)
    Employee(Employee emp) {
        this.id = emp.id;
        this.address = emp.address; // shallow copy: same reference
    }
}

public class employeedata {
    public static void main(String[] args) {
        // Step 1: Create employee emp1
        Address addr1 = new Address("Delhi");
        Employee emp1 = new Employee(101, addr1);

        // Step 2: Create emp2 using copy constructor
        Employee emp2 = new Employee(emp1);

        // Step 3: Change city via emp2
        emp2.address.city = "Mumbai";

        // Step 4: Print city of both employees
        System.out.println("emp1 city: " + emp1.address.city);
        System.out.println("emp2 city: " + emp2.address.city);
    }
}

