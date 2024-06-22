package assignment_no1;

public class Question_3_sum_of_element_in_array {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum Of Array is:"+sum);
	}

}
