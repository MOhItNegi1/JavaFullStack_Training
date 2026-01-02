package basics;

import java.util.Scanner; 

class dvision{
	// To check whether a no is divisible by 7 or not 

	void div1(int num) {
	if(num%7==0) {
		System.out.println(num +" is divisible by 7");
	}
	else {
		System.out.println(num +" is not divisible by 7");
	}
	
}
	// To check whether a no is divisible by both 3 and 5 

	void div2(int num) {
		if(num%3==0 && num%5==0) {
			System.out.println(num+"is  divisible by 3 and 5 both");
		}
		else {
			System.out.println(num+"is not divisible by both 3 and 5 ");
		}
	}
	
}




public class p2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		// to check if a char is uppercase or lowerchase or digit or the given char is special char 
		
//		char s=sc.next().charAt(0);
//		
//		if(s>='A' && s<='Z') {
//			System.out.println(s+" is a uppercase letter");
//		}
//		else if(s>='a' && s<='z') {
//			System.out.println(s+" is a lowercase letter");
//			
//		}
//		else if(s>='0' && s<='9') {
//			System.out.println(s+" is a digit");
//
//		}
//		else {
//			System.out.println(s+" is a special character");
//
//		}
		
		
		
		
		
		// gardes based on marks 
//		int marks=sc.nextInt();
//		if( marks>=90){
//			System.out.println("Grade A");
//			
//		}
//		else if(marks>=75 && marks<90) {
//			System.out.println("Grade B");
//
//		}
//		else if(marks>=60 && marks<75) {
//			System.out.println("Grade C");
//
//		}
//		else if(marks>=40 && marks<60) {
//			System.out.println("Grade D");
//
//		}
//		else if(marks<40) {
//			System.out.println("Fail");
//
//		}
//		else {
//			System.out.println("Invalid marks ");
//
//		}
		
		
		
		
		
		
		// to check for uppercase  ,lowercase  vowels and consonant
		
//		char a=sc.next().charAt(0);
//		if(a=='a' || a=='e' || a=='i' ||a=='o' || a=='u'||a=='A'||a=='E'||a=='I'|| a=='O'||a=='U') {
//			if(a>='A' && a<='Z') {
//				System.out.println("Uppercase Vowel");
//
//			}
//			else {
//				System.out.println("Lowercase Vowel");
//
//			}
//		}
//		else {
//			if(a>='A' && a<='z') {
//				System.out.println("Uppercase consonant");
//
//			}
//			else {
//				System.out.println("Lowercase Consonant");
//
//			
//		}
//		
//		}
		
		
		
		// WAP to find max and min
		
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=sc.nextInt();
//		if(num1>num2 && num1>num3) {
//			System.out.println(num1 +"is max");
//		}
//		else if(num2>num1 && num2>num3) {
//			System.out.println(num2+" is max");
//
//		}
//		else {
//			System.out.println(num3+" is max");
//
//		}
//		
//		
//		if(num1<num2 && num1<num3) {
//			System.out.println(num1 +" is min");
//		}
//		else if(num2<num3 && num2<num1) {
//			System.out.println(num2 +" is min");
//		}
//		else {
//			System.out.println(num3 +" is min");
//		}
//		
//		
//		
//		
//		
		
		
		
		// positive -ve or 0 
		
		
//		int num=sc.nextInt();
//		
//		if(num>0) {
//			System.out.println("Positive");
//		}
//		else if(num==0) {
//			System.out.println("Zero");
//		}
//		else {
//			System.out.println("Negative");
//		}
		
		
		
		
		
		
		
		
		// To check if a  year is a leap year or not 
//		int year=sc.nextInt();
//		if(year%400==0) {
//			System.out.println("Leap year");
//		}
//		else if(year%4==0 && year%100!=0) {
//			System.out.println("Leap Year");
//		}
//		else {
//			System.out.println("Not Leap Year");
//		}
//	
//		
//		
//		
//		
		
		
		
		//print statement swicth cases 
//		String fruit=sc.next();
//		
//		switch(fruit) {
//		case "apple":
//			System.out.println("apples are rich in fibers and vitamin c ");
//			break;
//		case "banana":
//			System.out.println("banana are great source of potassium ");
//			break;
//		case "mango":
//			System.out.println("Mangoes are the king of fruits ");
//			break;
//		case "orange":
//			System.out.println("oranges are packed with vitamin c ");
//			
//			break;
//		default:
//			System.out.println("sorry ! I dont have information about taht fruit");
//		}
//		
//		String a=sc.next();
//		switch(a) {
//		case "A":
//			System.out.println("Excellent ");
//			break;
//		case "B":
//			System.out.println("Good");
//			break;
//		case "C":
//			System.out.println("Fair");
//			break;
//		case "D":
//			System.out.println("Pass");
//			break;
//		default:
//			System.out.println("Fail");
//		}
//		
//		
		
		
		
		
		
		
		
		
//		System.out.println("1. to    add two numbers \n"
//				+ "2.  to add 3 numbers \n"
//				+ "3.  to add 4 numbers \n"
//				+ " SUBSTRACTION \n"
//				+ "4.   to sub 2 variable \n"
//				+ "5.   to sub 3 variable \n"
//				+ "6.   to sub 4 variable \n"
//				+ "Multiplication\n"
//				+ "7.   multiply 2 variable\n"
//				+ "8.   multiply 3 variables\n"
//				+ "9.   multiply 4 variables\n"
//				+ "DIVISION\n"
//				+ "10. devide 2 variables");
//		
//		int ch=sc.nextInt();
//		switch(ch) {
//		case 1:
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			System.out.println(a+b);
//		case 2:
//			int a1=sc.nextInt();
//			int b1=sc.nextInt();
//			int c1=sc.nextInt();
//			System.out.println(a1+b1+c1);
//		case 3:
//			int a2=sc.nextInt();
//			int b2=sc.nextInt();
//			int c2=sc.nextInt();
//			int d2=sc.nextInt();
//			System.out.println(a2+b2+c2+d2);
//		case 4:
//			int a3=sc.nextInt();
//			int b3=sc.nextInt();
//			System.out.println(a3-b3);
//		case 5:
//			int a4=sc.nextInt();
//			int b4=sc.nextInt();
//			int c4=sc.nextInt();
//			System.out.println(a4-b4-c4);
//		case 6:
//			int a5=sc.nextInt();
//			int b5=sc.nextInt();
//			int c5=sc.nextInt();
//			int d5=sc.nextInt();
//			System.out.println(a5-b5-c5-d5);
//		case 7:
//			int a6=sc.nextInt();
//			int b6=sc.nextInt();
//			System.out.println(a6*b6);
//		case 8:
//			int a7=sc.nextInt();
//			int b7=sc.nextInt();
//			int c7=sc.nextInt();
//			System.out.println(a7*b7*c7);
//		case 9:
//			int a8=sc.nextInt();
//			int b8=sc.nextInt();
//			int c8=sc.nextInt();
//			int d8=sc.nextInt();
//			System.out.println(a8*b8*c8*d8);
//		case 10:
//			int x=sc.nextInt();
//			int y=sc.nextInt();
//
//			System.out.println(x/y);
//		default:
//			System.out.println("invalid choice ");
////			
//			
			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	
		
		
		
		

}
}





