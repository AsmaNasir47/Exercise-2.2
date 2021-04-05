package PhoneProfile;

public class Phone {
	//declare all type of variable and variable name
	String brand;
	int price;
	String colour;
	double weight;
	char fingerprint;
	
	void printSpec(String b, String c, int p, double w, char f) {
		System.out.println("Brand         " + b);
		System.out.println("Colour        " + c);
		System.out.println("Price         " + "RM" + p);
		System.out.println("Weight        " + w + "gm");
		System.out.println("Fingerprint   " + f);
	}

	void calculatePrice (int p, int q) {
		int t=p*q;
		System.out.println("total price RM" + t);		
	}
	
	void calculateWeight (double w, int q) {
		double v=w*q;
		System.out.println("weight value  " + v + "gm");
	}
	
	void calculateAvg (double w, double v) {
		double a=w/v;
		System.out.println("weight average " + a);		
	}
}
