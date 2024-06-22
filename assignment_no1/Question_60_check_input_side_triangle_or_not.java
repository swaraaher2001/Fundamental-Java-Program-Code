package assignment_no1;

import java.util.Scanner;

public class Question_60_check_input_side_triangle_or_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		
		System.out.println("Enter 3rd No:");
		int c=sc.nextInt();
		
		if(a+b>c  &&  b+c>a && a+c>b) {
			System.out.println("Valid Triangle....");
		}
		else {
			System.out.println("Not Valid.....");
		}
		
		
		
		
	}

}
