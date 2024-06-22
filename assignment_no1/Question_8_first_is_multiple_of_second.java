package assignment_no1;

import java.util.Scanner;

public class Question_8_first_is_multiple_of_second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		
		if(b!=0&&a%b==0) {
			System.out.println(a+" is multiple of second no "+b);
			
		}
		else if(b==0) {
			System.out.println("Second no is zero!!!!!!!!");
		}
		else {
			System.out.println(a+" is not multiple of second no "+b);
			System.out.println("A%B:"+(a%b));
		}
		
	}

}
