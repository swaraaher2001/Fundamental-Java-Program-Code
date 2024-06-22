package assignment_no1;

import java.util.Scanner;

public class Question_5_find_last_element_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter element in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Last Element is:"+(arr.length));
		
	}

}
