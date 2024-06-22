package assignment_no1;

import java.util.Scanner;

public class Question_25_print_reverse_of_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit");
		int n=sc.nextInt();
		
		int rev=0,remi;
		int temp=n;
		
		while(n!=0) {
			remi=n%10;
			rev=rev*10+remi;
			n=n/10;
		
		}
		System.out.println("Reverse of no:"+rev);
	}


}
