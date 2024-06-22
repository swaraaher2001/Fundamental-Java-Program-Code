package assignment_no1;

public class Question_patterens_22 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i*2-1);
			}
			System.out.println();
		}

	}

}
