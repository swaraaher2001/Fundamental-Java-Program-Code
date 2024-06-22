package assignment_no1;

import java.util.Scanner;

public class Question_29_count_po_ne_nnutr_user_n_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int nega=0,posi=0,nutr=0;
		int arr[]=new int[size];
		System.out.println("Enter Element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]<0) {
				nega++;
			}
			else if(arr[i]>0) {
				posi++;
			}
			else {
				nutr++;
			}
			
		}
		
		System.out.println("Negative No:"+nega);
		System.out.println("Positive NO:"+posi);
		System.out.println("Nutral No:"+nutr);
		
		
		

		
	}

}
