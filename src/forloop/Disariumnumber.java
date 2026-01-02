package forloop;
import java.util.Scanner;

public class Disariumnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int ct = 0;

     
        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + digit;
            ct++;
        }

        int sum = 0;
        int pos = 1;

        while (rev > 0) {
            int dig = rev % 10;
            rev = rev / 10;
            sum += Math.pow(dig, pos);
            pos++;
        }

       
        if (sum == num) {
            System.out.println(num + " is a Disarium number");
        } else {
            System.out.println(num + " is NOT a Disarium number");
        }
    }
}
