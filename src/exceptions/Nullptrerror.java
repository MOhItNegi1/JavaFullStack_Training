package exceptions;


public class Nullptrerror {
    public static void main(String[] args) {
        System.out.println("main start");
        String str = null;

        try {
            System.out.println("Length of the string is : ");
            int length = str.length(); 
            System.out.println("Length: " +length);
        } 
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("handled: ");
        } 
        finally {
            System.out.println("finally block executed");
        }
        
        System.out.println("main end");
    }
}