 
package basics;
import java.util.Scanner;

public class digitprint {
    


    // WAP to print the gigits of a given no

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the num:");
    //     int num=sc.nextInt();

    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
    //         System.out.println(digit);
    //     }
    // }






    // WAP to print even digits of a given no 

    //     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the num:");
    //     int num=sc.nextInt();

    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
    //         if(digit%2==0){
    //         System.out.println(digit);
    //         }
    //     }
    // }




    //WAP to print prime digits of a given no


    //     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the num:");
    //     int num=sc.nextInt();
        
    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
    //         int fact=0;

    //         for(int i=1;i<=digit;i++){     // factors check
    //         if(digit%i==0){
    //             fact+=1;
    //         }
    //     }

    //     if(fact==2){
    //         System.out.println(digit);
    //     }

    //     }
    // }






    // WAP to calculate sum of all digits


    //     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the num:");
    //     int num=sc.nextInt();
    //     int sum1=0;
    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
    //         sum1+=digit;
            
    //     }
    //     System.out.println(sum1);
    // }

    

    // WAP to find the smallest digit from given no 
    // WAP to find the largest digit
 



    //     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the num:");
    //     int num=sc.nextInt();
    //     int small=9;
    //     int large=0;


    //     while(num>0){
    //         int digit=num%10;
    //         num=num/10;
            
    //         if(digit>large){
    //             large=digit;
    //         }

    //         if(digit<small){
    //             small=digit;
    //         }


            
    //     }

    //     System.out.println(small);
    //         System.out.println(large);
    // }
    


   // WAP to find the second smallest digit 
    // WAP to find the second largest digit


 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num:");
        int num=sc.nextInt();
        int small=9;
        int large=0;
        int secondsmall=9;
        int secondlarge=0;


        while(num>0){
            int digit=num%10;
            num=num/10;
            
            if(digit>large){
                secondlarge=large;
                large=digit;
            }
            else if(digit<large && digit>secondlarge){
                secondlarge=digit;
            }






            if(digit<small){
                secondsmall=small;
                small=digit;
            }
            else if(digit>small && digit<secondsmall){
                secondsmall=digit;
            }


            
        }

            System.out.println("large    "+large);
            System.out.println("second large    "+secondlarge);
            System.out.println("small     "+small);
            System.out.println("second small    "+secondsmall);
    }












}
