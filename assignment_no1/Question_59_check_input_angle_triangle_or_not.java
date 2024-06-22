package assignment_no1;

import java.util.Scanner;

public class Question_59_check_input_angle_triangle_or_not {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Angle:");
		int angle_1=sc.nextInt();
		System.out.println("Enter 2st Angle:");
		int angle_2=sc.nextInt();
		System.out.println("Enter 3st Angle:");
		int angle_3=sc.nextInt();
		
		int sum=angle_1+angle_2+angle_3;
		
		if(sum==180) {
			System.out.println("Triangle...!");
		}
		else {
			System.out.println("Not Triangle...!");
		}
	}

}
