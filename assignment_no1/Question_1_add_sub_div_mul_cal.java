package assignment_no1;

import java.util.Scanner;

public class Question_1_add_sub_div_mul_cal {

	public static void main(String[] args) {
		/*Create a simple calculator program that takes two numbers and an operator (+, -, *, /)
		as input. Perform the corresponding operation and display the result. If an invalid
		operator is entered, print an error message.*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second No:");
		int b=sc.nextInt();
		
		int option;
		
		do {
			
			System.out.println("\n"
					+ "1.Addition\n"
					+ "2.Subtraction\n"
					+ "3.Multiplication\n"
					+ "4.Division\n"
					+ "5.Modification\n"
					+ "0.Exit");
			
			System.out.println("Enter Your Choise:");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("*************************");
				System.out.println("Addition Of No is:"+(a+b));
				System.out.println("*************************");
				break;
			case 2:
				System.out.println("*************************");
				System.out.println("Subtraction Of No is:"+(a-b));
				System.out.println("*************************");
				break;
			case 3:
				System.out.println("*************************");
				System.out.println("Multiplication Of No is:"+(a*b));
				System.out.println("*************************");
				break;
			case 4:
				System.out.println("*************************");
				System.out.println("Division Of No is:"+(a/b));
				System.out.println("*************************");
				break;
			case 5:
				System.out.println("*************************");
				System.out.println("Modification Of No is:"+(a%b));
				System.out.println("*************************");
				break;
			case 0:
				System.out.println("*************************");
				System.out.println("Than you!!!!!");
				System.out.println("*************************");
				break;
		   default:
			   System.out.println("*************************");
				System.out.println("Invalid Choise.......");
				System.out.println("*************************");
				break;
				
			
				
			}
			
		}while(option!=0);
		

	}

}
