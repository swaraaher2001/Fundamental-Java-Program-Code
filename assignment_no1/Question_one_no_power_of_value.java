package assignment_no1;

import java.util.Scanner;

public class Question_one_no_power_of_value {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		System.out.println("Enter Power Of value");
		int power=sc.nextInt();
		
		int value=1;
		
		for(int i=1;i<=power;i++) {
			value*=n;
		}
		
		System.out.println(n+" Power Of "+power+" is:"+value);
			
		

	}

}
