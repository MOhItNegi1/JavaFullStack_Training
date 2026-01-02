package forloop;
import java.util.Scanner;
public class perfectnum1to100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int j=1;j<=100;j++){
            int s=0;

         for(int i=1;i<j;i++){
            if (j%i==0) {
                s+=i;
                
            }
         }
         if(s==j){
            System.out.println(j+" is a perfect number ");
         }
        
        }
        sc.close();
    }
    
    
}
