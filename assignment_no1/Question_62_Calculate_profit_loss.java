package assignment_no1;

import java.util.Scanner;

public class Question_62_Calculate_profit_loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Selling Price");
		double sel=sc.nextDouble();
		
		System.out.println("Enter Cost Price");
		double cost=sc.nextDouble();
		
		if(sel>cost){
			double Profit= sel-cost;
			System.out.println("Profit:"+Profit);
		}
		else if(sel<cost){
			double Loss=cost-sel;
			System.out.println("Loss:"+Loss);
		}
		else {
			System.out.println("No Profit No Loss");
		}
		
		
		
		
		
	}

}
