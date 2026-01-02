package Array;

import java.util.Scanner;

public class primeelements {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }

    for(int i=0;i<n;i++){
        int fact=0;
        for (int j=1;j<=arr[i];j++){
            if(arr[i]%j==0){
                fact+=1;
            }
        }
        if(fact==2){
            System.out.println(arr[i]);
        }
        
    }

    


    sc.close();
    }
    
}
