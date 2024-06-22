package assignment_no1;

import java.util.Scanner;

public class Question_27_check_weather_no_is_prime_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n==0 || n==1) {
			System.out.println("O and 1 is not Prime No");
			isPrime=false;
			
		}
		else {
			for(int i=2;i<=(n/2);i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime==true){
			System.out.println("Prime!!!");
		}
		else {
			System.out.println("Not Prime!!!");
		}
		
		
		
	}

}
