package week1.day1A;

public class TwoWheeler {
	int noOfWheels = 4 ;
	short noOfMirrors = 5;
	long chassisNumber = 8932432984392084l;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 150000.700;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler myBike =  new TwoWheeler();
		System.out.println(myBike.bikeName);
		System.out.println(myBike.chassisNumber);
		System.out.println(myBike.isPunctured);
		System.out.println(myBike.noOfWheels);
		System.out.println(myBike.runningKM);
		System.out.println(myBike.noOfMirrors);

				
				

	}

}
