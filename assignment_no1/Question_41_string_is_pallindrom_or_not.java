package assignment_no1;

import java.util.Scanner;

public class Question_41_string_is_pallindrom_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		String temp=str;
		String remi,rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Pallindrom...");
		}
		else {
			System.out.println("Not Pallindrom...");
		}
		
		
	}

}
