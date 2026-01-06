package oops.Inheritance;

class Father{
    static int a;
    public static void test(){
        System.out.println("father class static method:");

    }  

    static{
        System.out.println("SIB father class:");
    }
}

class Son extends Father{
    static int b=20;
    public static void demo(){
        System.out.println("Son class static method");
    }

    static{
        System.err.println("SIB son class");
    }
}


public class fatherson {
    static{
        System.err.println("SIB Driver Class");
    }

    public static void main(String[]args){
        System.err.println("Main Start:");
        System.out.println(Son.a);
		System.out.println(Son.b);
		Son.demo();
		System.out.println(Father.a);
		Father.test();

        System.out.println("main end :");
    }
    
}
