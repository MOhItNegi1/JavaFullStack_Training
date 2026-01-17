package exceptions;

public class classcastexception {
    public static void main(String[] args) {
        System.out.println("main start");
        Object obj = "This is a string";

        try {
            System.out.println("Attempting to cast Object to Integer...");
            Integer num = (Integer) obj; 
            System.out.println("Number: " + num);
        } 
        catch ( Exception e) {
            e.printStackTrace();
            System.out.println("handled: Cannot cast a String to an Integer.");
        } 
        finally {
            System.out.println("finally block executed");
        }

        System.out.println("main end");
    }
}