package assignment_no1;

import java.util.Scanner;

public class Question_52_Check_enter_year_leap_year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("Leap Year...!");
		}
		else {
			System.out.println("Not Leap Year...!");
		}
	}

}
