package assignment_no1;

import java.util.Scanner;

public class Question_32_Check_no_is_strong_or_not {

	public static void main(String args[]) {
		int inputNumber=143;
		
		int sum=0;
		int digit,factorial;
		
		int i;
		int temp=inputNumber;
		
		while(temp!=0) {
			 i=1;
			factorial=1;
			digit=temp%10;
			
			while(i <= digit) {
	            factorial = factorial * i;
	            i++;
	         }
			
			sum=sum+factorial;
			temp=temp/10;
			
		}
		
		System.out.println("Sum is:"+ sum);
		if(inputNumber==sum) {
			System.out.println("Strong No...");
			
		}
		else {
			System.out.println("Not Strong No...");
		}
		
		
		
		
		
	}
}
