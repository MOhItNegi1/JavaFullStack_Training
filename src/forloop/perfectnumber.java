package forloop;
import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int s=0;
         for(int i=1;i<num;i++){
            if (num%i==0) {
                s+=i;
                
            }

         }
         if(s==num){
            System.out.println(num+" is a perfect number ");
         }
         else{
            System.out.println("not a perfect number ");
         }
         sc.close();
    }
    
}
