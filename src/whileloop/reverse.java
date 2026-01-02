package whileloop;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int revnum=0;
        while(num!=0){
            int digit=num%10;
            num=num/10;
            
            revnum=revnum*10+digit;
        }
        System.out.println(revnum);

        
    }
    
//wap to print a palindrome number
// wap to print all strong numbers from the range 1 to 100

}
