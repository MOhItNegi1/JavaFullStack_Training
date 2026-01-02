package oops;

/*
object : It is an instance of a class.
-> by using new keyword.
-> new Classname().

what is new?
-new is a keyword.
-It is unary operator.
-with the help of new keyword we can create n no of objects for one class.
-It will return address of an object.
-whenecer we use new keyword a new object will be created.


Classname is a non primitive datatype which is used to store new type of data structure.

How to use non static member in a static  context .
-> with the help of object reference variable .

How to use static member inside static context?
-> directly 
-> with the help of class name.
->with the help of object reference variable. 


Note: every object is directly poinitng toeards class static area.


write a diff between static and non static variable:




whenever we have non static variable and local variable with same name.
if we use it directly inside non static context the high priority is given for local variable.
to use non static variable we have to use this.


this:
it is non static reference variable.
It is used to store the addres of current object.
it can be used only inside non static context.





*/


// driver class
public class object {
    // public area or global area 

    // static int a=10;
    // static String User_name;

   
    // public static void main(String[] args) {
    //     System.out.println("main start");
    //     System.out.println("Directly "+a);
    //     System.out.println("eith the help of class name "+object.a);

    //     object ref =new object();
    //     System.out.println("whith the help of object ref:" +ref.a);

    //     System.out.println("main end ");



    //     object ref1=new object();
    //     ref1.User_name="Devansh";

    //     object ref2=new object();
    //     ref2.User_name="Vishnu";

    //     object ref3=new object();
    //     ref3.User_name="Mohit";

    //     System.out.println("Username1 = "+ref1.User_name);
    //     System.out.println("Username2 = "+ref2.User_name);
    //     System.out.println("Username3 = "+ref3.User_name);
        
    // }











    //non static method
    public void test(){
        // non static context
        System.out.println("tets start ");
        System.out.println("This "+this);
        System.out.println("test end ");

    }

    public static void main(String[] args) {
        // static context

        System.out.println("main start ");
        object ref1=new object();
        System.out.println("ref1 :"+ref1);
        object ref2=new object();
        System.out.println("ref2 :"+ref2);
        object ref3=new object();
        System.out.println("ref3 :"+ref3);
        ref2.test();
        //System.out.println(this);  // CTE Cannot use this in a static context
        
        

    }





    
}
