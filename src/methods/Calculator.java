package methods;
import java.util.Scanner;


    
// WAP to create calculator class consists of four methods 
// 1. to add 3 variables
// 2 multiply 3 variables
//3  to substract 4 variables
//4  to add 2 variables



class Calculator {

    // 1. Add 3 variables
    public int addThree(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Multiply 3 variables
    public int multiplyThree(int a, int b, int c) {
        return a * b * c;
    }

    // 3. Subtract 4 variables (a - b - c - d)
    public int subtractFour(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    // 4. Add 2 variables
    public int addTwo(int a, int b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Add 3 numbers: " + obj.addThree(10, 20, 30));
        System.out.println("Multiply 3 numbers: " + obj.multiplyThree(2, 3, 4));
        System.out.println("Subtract 4 numbers: " + obj.subtractFour(100, 20, 10, 5));
        System.out.println("Add 2 numbers: " + obj.addTwo(15, 25));
    }
}









