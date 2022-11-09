package week1.day2C;

public class factorial {

	public static void main(String[] args) {
		
		int input  = 4;	
		int fact= 1;
		
		for (int i=1; i<=input; i++) {
			
			 fact = i*fact;

		}
		
		System.out.println(fact);
	}

}
