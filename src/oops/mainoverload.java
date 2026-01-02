package oops;

public class mainoverload {
    public static void main(String[]args){
        System.out.println("main method start");
        main(10);
    }

    public static void main(int a)
    {
        System.out.println("main overload method start" +a);
    }


    
}
