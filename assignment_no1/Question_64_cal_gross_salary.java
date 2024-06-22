package assignment_no1;

import java.util.Scanner;

public class Question_64_cal_gross_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double basic_sal=sc.nextDouble();
		
		double hra,da;
		
		if(basic_sal<=10000) {
			hra=basic_sal*0.2d;
			da=basic_sal*0.8d;
		}
		else if(basic_sal<=20000) {
			hra=basic_sal*0.25d;
			da=basic_sal*0.9d;
			
		}
		else {
			hra=basic_sal*0.25d;
			da=basic_sal*0.9d;
		}
		
		System.out.println("Gross Salary:"+(basic_sal*hra*da));
		
	}

}
