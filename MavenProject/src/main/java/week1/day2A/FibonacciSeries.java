package week1.day2A;

public class FibonacciSeries {
	
	//0,1,1,2,3,5,8,13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8 ; 
		int first_number =0;
		int second_number =1;
		System.out.println(first_number);
		System.out.println(second_number);	
		
		for (int i =1; i<=range; i++) {
			
			int sum = first_number + second_number;
			first_number = second_number;
			second_number = sum;
			System.out.println(sum);
			
		}
				
		
				
		
		

	}

}
