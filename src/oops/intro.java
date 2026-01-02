package oops;

/*


fundamentals of oops:
types of Golbal Variables:
1. Static Variables 
2. Non Static Variables


Static Members:
1. Static variables:
    A variable which is declare inside class area or global area with static keyword is known as static variable.
    It is a type of global Varaible
    We can use without initialization beacuse it can store default values.
    We can use global variables inside global area as well as local area.

    default values:
    byte=0
    short=0
    int=0
    long=0
    float=0.0
    double=0.0
    char=
    boolean =false
    String= Null


    * Diff Between gloabal and local Variable.

    *  when we have static ans local variable as same name,
    priority is of the local variable too use static variable we have to consider class name.member..


    * for execution program jvm have some memory areas.
    1. Static area.
    every clas will have a dedicated memory to store all static members is known as static area.
    the name of the class static area is same as class name .
    every static context is directly pointing towards class static area.
    
    2. static area.
    it is used for execution.

    3. heap area 
    Note: for execution jvm first calls  main method. 

    * Write a diff between static method and static block.
    
    - Declared with the `static` keyword inside a class, followed by a method signature. 
    + Declared with the `static` keyword followed by a block `{}` inside a class. 

    - Used to define reusable logic that can be called without creating an object.
     + Used to initialize static variables or run setup code when the class is loaded.

     - Can be invoked explicitly using `ClassName.methodName()`. 
     + Executes automatically once when the class is loaded into memory. 

     - Can accept parameters and return values.
      + Cannot accept parameters or return values; it’s just a block of code.




*/



public class intro {
    // class area or global area.
    static int a=10;

    //static method.
    public static void main(String[]args){
        //Static method
        System.out.println("main start");
        System.out.println(a);




        test();
        System.out.println("main end");
    }
    public static void test(){
        System.out.println("test start");
        System.out.println(a);
        int a=25;
        System.out.println(a);
        System.out.println(intro.a);
    }
    
}
