package assignment_no1;

import java.util.Scanner;

public class Question_65_5_digit_no_and_reverse_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit:");
		int digit=sc.nextInt();
		
		int rev=0,remi;
		
		int temp=digit;
		
		while(temp!=0) {
			remi=temp%10;
			rev=rev*10+remi;
			temp=temp/10;
			
		}
		
		if(digit==rev) {
			System.out.println("Reverse no is same ad entered no...!");
		}
		else {
			System.out.println("Reverse no is not same ad entered no...!");
		}
		
	}

}
