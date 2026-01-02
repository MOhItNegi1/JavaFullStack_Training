package whileloop;

import java.util.Scanner;

public class digitfactorial{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            int digit=num%10;
            num=num/10;
            int fact=1;
            for(int j=1;j<=digit;j++){
                fact=fact*j;
            }
            System.out.println(fact);

        }
    }
}  


