package week1.day1A;

public class Mobile {
	String mobileBrandName = "Nokia";
	char mobileLogo ='@';
	short noOfMobilePiece = 500;
	int modelNumber =12;
	long mobileImeiNumber=324234234234234l;
	float mobilePrice =150000.99f;
	boolean isDamaged =true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile myMobile = new Mobile();
		System.out.println(myMobile.isDamaged);
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileImeiNumber);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.noOfMobilePiece);


	}

}
