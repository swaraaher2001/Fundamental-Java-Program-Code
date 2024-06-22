package assignment_no1;

import java.util.Scanner;

public class Question_39_check_no_prime_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		boolean isPrime=true;
		
		if(no==0 || no==1) {
			System.out.println("0 & 1 Are Not Prime No");
			isPrime=false;
			
		}
		else {
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime==true) {
			System.out.println("Prime...");
		}
		else {
			System.out.println("Not Prime...");
		}
		
		

	}

}
