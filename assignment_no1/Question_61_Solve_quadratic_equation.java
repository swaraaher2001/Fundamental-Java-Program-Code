package assignment_no1;
import java.math.*;
import java.util.Scanner;

public class Question_61_Solve_quadratic_equation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		System.out.println("Enter 2st No:");
		int b=sc.nextInt();
		System.out.println("Enter 3st No:");
		int c=sc.nextInt();
		
		double dis=b*b-4*a*c;
		double root1,root2;
		if(dis>0) {
			root1=(-b+Math.sqrt(dis))/(2*a);
			root2=(-b-Math.sqrt(dis))/(2*a);	
		System.out.format("Root1 =%.2f and Root2=%.2f",root1,root2);		
		}
		
		else if(dis==0) {
			root1=root2=-b/(2*a);
			System.out.format("Root1 = Root2=%.2f",root1);
			
		}
		else {
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-dis)/(2*a);
			System.out.format("Root1 =%.2f +%.2fi",real,imaginary);
			System.out.format("\nRoot2 =%.2f -%.2fi",real,imaginary);
			
		}
		
	}

}
