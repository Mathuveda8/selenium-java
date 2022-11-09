package week1.day2C;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalc = new Calculator();
		
		int add_res = myCalc.add(50, 60, 70);
		
		float divide_res= myCalc.divide(50.65f, 2.35f);
		
		int sub_res =  myCalc.sub(50, 30);
		
		double mul = myCalc.mul(38.567, 45.89);
		
		
		System.out.println(add_res);
		System.out.println(divide_res);
		System.out.println(sub_res);
		System.out.println(mul);


	}

}
