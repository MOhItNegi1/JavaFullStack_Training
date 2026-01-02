package basics;

import java.util.Scanner;
public class p1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pasennger id ");
        int id = sc.nextInt();
    
        System.out.println("passenger name ");
        String name = sc.nextLine();

        System.out.println("passenger age ");
        int age = sc.nextInt();

        System.out.println("type of ticket (1 bus 2 train 3 flight)");
        int type = sc.nextInt();
        System.out.println("enter base fair ");
        double base = sc.nextDouble();
        System.out.println("are you a government employee (true/false) ");
        boolean is_gvo = sc.nextBoolean();

        if (age<5){
            System.out.println("free ticket");
        } else if(age>80) {
            System.out.println("medical clearance required");
        }
        
        





    }
}
