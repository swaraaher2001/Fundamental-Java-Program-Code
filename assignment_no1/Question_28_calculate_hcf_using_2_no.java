package assignment_no1;

import java.util.Scanner;

public class Question_28_calculate_hcf_using_2_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no:");
		int a=sc.nextInt();
		
		System.out.println("Enter No:");
		int b=sc.nextInt();
		
		
		int min=(a<b)?a:b;
		int hcf=0;
		
		for(int i=1;i<min;i++){
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("A:"+a+" B:"+b+" Hcf:"+hcf);
		

	}

}
