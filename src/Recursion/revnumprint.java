package Recursion;
// odd numbers from the range 500 to 50 without loop
public class revnumprint {


    public static void numprint(int n){
        if(n>=50){
        System.out.println(n);
        numprint(--n);

        }

    }
    public static void main(String[] args) {
        numprint(500);

    } 
    

}