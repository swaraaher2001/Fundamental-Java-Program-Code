package assignment_no1;

import java.util.Scanner;

public class Question_30_Largest_smalles_no {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int min=arr[0] ;
		int max=arr[0];
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]>max) {
				max=arr[i];
			
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			System.out.println("Smallest Value:"+min);
			System.out.println("Largest value:"+max);
		}
		
		
		
	}
	
	
}
