package Array;

import java.util.Scanner;

public class perfect {
        public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }

    for(int i=0;i<n;i++){
        int sum=0;
        for (int j=1;j<arr[i];j++){
            if(arr[i]%j==0){
                sum+=j;
            }
        }
        if(sum==arr[i]){
            System.out.println(arr[i]);
        }
        
    }

    


    sc.close();
    }
    
    
}
