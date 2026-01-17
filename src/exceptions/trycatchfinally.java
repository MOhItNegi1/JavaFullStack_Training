package exceptions;

import java.util.Scanner;

public class trycatchfinally {
    public static void main(String []args){
        System.out.println("main start");
        Scanner sc=new Scanner(System.in);

        try{
        System.out.println("enter value for a :");
        int a=sc.nextInt();
        System.out.println("enter value for b :");
        int b=sc.nextInt();

        int ans =a/b;
        System.out.println("ans: "+ans);
        }

        catch(Exception e){

                e.printStackTrace();
                System.out.println("handled");
        }
        finally{
        System.out.println("finally block executed :");
        sc.close();

        }
        System.out.println("main end");

    } 

    
}


//class cast exception
//nullptr exception