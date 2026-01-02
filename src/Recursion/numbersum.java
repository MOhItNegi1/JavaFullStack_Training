package Recursion;
// WAP to print sum of all numbers from the range 1 to 5 without loops 
public class numbersum {


    public static int fun(int n){
        if (n==1) return 1;

        return (n+fun(n-1));

    }
    public static void main(String[]args){
        int n=5;
        int ans =fun(n);
        System.out.println(ans);

    }
}