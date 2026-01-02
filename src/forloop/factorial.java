package forloop;
import java.util.Scanner;
public class factorial {

    // factorial of a given number  


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     int fact=1;
    //     for(int i=1;i<=num;i++){
    //             fact=fact*i;
    //         }

        
    //     System.out.println("factorial of "+num+"  is "+fact );
    // }


    // Factorial of all numbers from 1 to 100

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     for(int j=1;j<=10;j++){
    //     long fact=1;
    //     for(int i=1;i<=j;i++){
    //             fact=fact*i;
    //         }

        
    //     System.out.println("factorial of "+j+"  is "+fact );
    //     }
    // }



    // factorial of  odd numbers   from range  10 to 1 



    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     for(int j=10;j>=1;j--){
    //     long fact=1;
    //     if(j%2!=0){
    //     for(int i=1;i<=j;i++){
                
    //             fact=fact*i;

    //             }
         
            
        
    //         System.out.println("factorial of "+j+"  is "+fact );
    //     }

        
        
    //     }
    // }
    


    // factorial of all the prime numbers from the range of 14 to 5
    
    

    
    // public static void main(String[] args) {
        
    //     for(int j=14;j>=5;j--){
    //     long fact=0;
    //     long ans=1;
    //     for(int i=1;i<=j;i++){
    //         if(j%i==0){
    //             fact+=1;
            
    //         }  
    //      }
    //      if(fact==2){
    //         for(int x=1;x<=j;x++){
    //             ans=ans*x;
    //         }
    //         System.out.println("factorial of "+j+"  is "+ans );

    //     }
    //     }
    // }



    //  addition of all prime numbers from the range 32 to 50 



    public static void main(String[] args) {
        int ans = 0; 

        for (int i =32; i<=50;i++) {
            long fact =0; 

            for (int x =1; x<=i; x++) {
                if (i%x==0) {
                    fact+= 1;
                }
            }

            if (fact == 2) { 
                ans=ans+i; 
            }
        }

        System.out.println( ans);
    }




    
}
