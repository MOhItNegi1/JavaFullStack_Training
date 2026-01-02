package Recursion;

public class noprint {

    public static void fun(int n){
        if(n<=1000){
        System.out.println(n);
        fun(++n);
        }
    }
    public static void main(String[] args) {
        fun(1);

        
    }
    
}
