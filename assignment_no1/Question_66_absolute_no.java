package assignment_no1;

import java.util.Scanner;

public class Question_66_absolute_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		double number=sc.nextDouble();
		
		double absolute=(number<0)?-number:number;
		System.out.println("Number :"+number+"\n Absolute No:"+absolute);
		
	}

}
