package basics;

import java.util.Scanner;

public class basics{
public static void main(String[]args){
    

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Employee id:");
    int id =sc.nextInt();
    System.out.println("Enter Employee name:");
    String name =sc.next();
    
    System.out.println("Enter Employee age:");
    int age =sc.nextInt();

    System.out.println("Enter Department choice:  (  1 for IT, 2 for HR, 3 for Finance )");
    int dept= sc.nextInt();  
    System.out.println("Enter Employee basic Salary:");
    double salary =sc.nextDouble();


    if (age<21){
        System.out.println("Employee is not eligible to work");

    }else{

        System.out.println("Department and role selection");
        System.out.println("ID -> developer , Tester");
        System.out.println("HR -> recruiter , Payroll");
        System.out.println("Finance -> Accountant, Auditor");
        int choice= sc.nextInt();
        int role=sc.nextInt();

        switch (choice) {
    case 1:
        switch (role) {
            case 1:
                System.out.println("Employee " + name + " is assigned the role of Developer in IT department");
                break;
            case 2:
                System.out.println("Employee " + name + " is assigned the role of Tester in IT department");
                break;
            default:
                System.out.println("Invalid role for IT department");
        }
        break;

    case 2:
        switch (role) {
            case 1:
                System.out.println("Employee " + name + " is assigned the role of Recruiter in HR department");
                break;
            case 2:
                System.out.println("Employee " + name + " is assigned the role of Payroll in HR department");
                break;
            default:
                System.out.println("Invalid role for HR department");
        }
        break;

    case 3:
        switch (role) {
            case 1:
                System.out.println("Employee " + name + " is assigned the role of Accountant in Finance department");
                break;
            case 2:
                System.out.println("Employee " + name + " is assigned the role of Auditor in Finance department");
                break;
            default:
                System.out.println("Invalid role for Finance department");
        }
        break;

    default:
        System.out.println("Invalid department choice");
}
    

    // Salary calculation 
    int allowance;
    if(choice==1 && role==1){
        allowance=30;
    }
    else if(choice==1 && role==2){
        allowance=25;
    }
    else if(choice==2 && role==1){
        allowance=20;
    }
    else if(choice==2 && role==2){
        allowance=22;
    }
    else if(choice==3 && role==1){
        allowance=28;
    }
    else{
        allowance=26;
    }

    double final_salary= salary+(salary*allowance/100);



    // Access level caluclation 
    String access_level;
    if(final_salary>=60000 && dept==1){
        access_level="Admin Access";
    }
    else if(final_salary>=60000 && dept==2 || dept==3){
        access_level="Manager Access";
    }
    else{
        access_level="Employee Access";
    }

    System.out.println("Overview of the employee");
    System.out.println("name: " + name);
    System.out.println("age: " + age);
    System.out.println("Department: " + choice);
    System.out.println("Role: " + role);
    System.out.println("Final Salary: " + final_salary);
    System.out.println("Access Level: " + access_level);






    }







    sc.close();
}
}
