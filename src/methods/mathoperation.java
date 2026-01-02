package methods;
import java.util.Scanner;
public class mathoperation {
    public static int max(int a,int b,int c){

        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return  b;
        }
        else{
            return c;
        }

    } 
    public static boolean isprime(int num){
        int fact=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                fact+=1;
            }
            
        }
        if(fact==2){
            return  true; 
        }
        else{
            return false;
        }
    }

    public static int min(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }

    public static int fibonacci(int n) {
    if (n == 0) return 0;   
    if (n == 1) return 1;   
    int a = 0;
    int b = 1;
    int c = 0;


    for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println(max(a, b, c));
    System.out.println(min(a, b, c));
}

}
