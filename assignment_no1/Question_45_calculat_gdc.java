package assignment_no1;

import java.util.Scanner;

public class Question_45_calculat_gdc {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		int gdc = 1;
		for(int i=1;i<=a && i<=b;i++) {
			
			if(a%i==0 && b%i==0) {
				gdc=i;
			}
			
		}
		
		System.out.println("Greatest Common Divisor: "+gdc);
		

	}

}
