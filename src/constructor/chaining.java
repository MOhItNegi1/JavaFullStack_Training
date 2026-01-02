package constructor;



/*

constructor chaining.

-One constructor is calling another constructor is known as constructor chaining.
How to achive:
1.using this( ) statement.
2.using super ( ) calling statement.

this():
It is a constructor calling statement.
It is used to call constructor of same class.
If we have n numbers of constructor then we can use n-1 this( ) calling statement.
If any constructor have this caling statement then that constructor does not have pli  pre loaded instructions  and Iib instance initializer block.

Note: constructor recursion is not possible becz it will not craete an object.
if we try to achive the constructor recursion it will give complie time error.


In constructor we can use only one   this()     calling statement.

Contractor calling statement must be the first statement in any constructor.


*/
// Driver class
public class chaining {
    // Instance variables
    int id;
    String name;
    double sal;

    // Default constructor
    public chaining() {
        this.id = 101;
        this.name = "Unknown";
        this.sal = 50000.0;
    }

    // Parameterized constructor: accepts id
    public chaining(int id) {
        this();           // calls default constructor
        this.id = id;     // overrides default id
    }

    // Parameterized constructor: accepts name
    public chaining(String name) {
        this();            // calls default constructor
        this.name = name;  // overrides default name
    }

    // Method to display object details
    public void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary: " + sal);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main Start");

        // Using constructor with int
        chaining ref1 = new chaining(1);
        ref1.display(); // ID: 1, Name: Unknown, Salary: 50000.0

        // Using constructor with String
        chaining ref2 = new chaining("Vishnu");
        ref2.display(); // ID: 101, Name: Vishnu, Salary: 50000.0

        System.out.println("Main End");
    }
}

