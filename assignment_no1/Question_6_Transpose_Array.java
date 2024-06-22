package assignment_no1;



public class Question_6_Transpose_Array {

	public static void main(String[] args) {
		int[][] original = {{1, 2, 3}, {4, 5, 6}};
		int[][] transpose = new int[2][3];
		
		for (int i = 0; i < 3; i++) {

			             for (int j = 0; j < 3; j++) {

			                transpose[j][i] = original[i][j];

			           }

			        }
		
		
		
		for (int i = 0; i < 3; i++) {

		            for (int j = 0; j < 3; j++) {

			                System.out.print(transpose[i][j] + " ");

			            }

			            System.out.println();

		        }
	
	}
	

}
