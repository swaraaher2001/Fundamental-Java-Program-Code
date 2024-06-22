package assignment_no1;

public class Question_31_sum_of_no_bet_100_200_and_divi_9 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=100;i<=200;i++) {
			if(i%9==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		
		System.out.println("\nSum Of All No between 100-200 and divisible by 9 is:"+sum);

	}

}
