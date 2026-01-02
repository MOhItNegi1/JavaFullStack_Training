package forloop;
import java.util.Scanner;

// strong no is sum of factorial of digits == original number
// public class strongnumber {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

        // int num=sc.nextInt();
        // int temp=num;
        // int sum=0;
        // while(num>0){
        //     int digit=num%10;
        //     num=num/10;
        //     int fact=1;
        //     for(int i=1;i<=digit;i++){
        //         fact=fact*i;
        //     }
        //     sum+=fact;

        // }
        // if(sum==temp){
        //     System.out.println( temp+" is  a strong number");
        // }




        
        
//     }
    
// }
public class strongnumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;

  
            int copy = temp;
            while (copy > 0) {
                int digit = copy % 10;
                copy = copy / 10;

                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact = fact * i;
                }

                sum += fact;
            }

            if (sum == temp) {
                System.out.println(temp + " is a strong number");
            }
        }
    }
}
