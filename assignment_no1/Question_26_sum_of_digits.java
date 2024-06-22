package assignment_no1;

import java.util.Scanner;

public class Question_26_sum_of_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit");
		int n=sc.nextInt();
		
		int sum=0,remi;
		int temp=n;
		
		while(n!=0) {
			remi=n%10;
			sum+=remi;
			n=n/10;
			
		}

		System.out.println("Sum Of The Digit:"+sum);
	}

}
