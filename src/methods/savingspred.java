package methods;

import java.util.Scanner;

// Savings Prediction Calculation

// Question Description
// A finance app predicts savings based on monthly income and expense habits.

// Implement overloaded methods named predict to calculate the expected savings.

// Methods
// 	double predict(double income, double expenses)
// 	double predict(double income, double expenses, boolean festiveMonth)
	
// Rules
// 	Base Savings = income − expenses
// 	Festive Month → expenses increase by 20%
	
// Hardcoded Data Set to Use
// 	Income = 45000
// 	Expenses = 30000
// 	Festive Month = true

// Expected Output
// 	Festive expenses = 36000
// 	Savings = 9000


public class savingspred {

    public static void predict (double inc, double exp){
        double savings=inc-exp;
        System.out.println("Savings = "+savings);

    } 
    public static void predict(double inc, double exp,boolean festiveMonth){
        if(festiveMonth==true){
        double savings=inc-(exp+exp*20/100);
        System.out.println("Festive expenses = "+(int)(exp+exp*20/100));
        System.out.println("Savings = "+(int)savings);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double inc=45000;
        double exp=30000;
        boolean festiveMont=true;
        predict(inc, exp, festiveMont);
        
        
    }
    
}
