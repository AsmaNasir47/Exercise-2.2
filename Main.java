package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		
		Phone vivo = new Phone();//create new object from class Phone name as vivo
		Phone huawei = new Phone();//create second object from class Phone name as huawei
		Phone samsung = new Phone();
		Phone redmi = new Phone();
		Phone realme = new Phone();
		Phone nokia = new Phone();
		Phone poco = new Phone();
		
		System.out.println("VIVO SPEFICATION");
		vivo.printSpec("V19","RED",399,55.6,'Y');
		vivo.calculatePrice(399, 2);
		vivo.calculateWeight(55.6, 2);
		vivo.calculateAvg(55.6, 2);
		
		System.out.println("HUAWEI SPECIFICATION");
		huawei.printSpec("Nova2i","BLACK",799,45.56,'N');
		huawei.calculatePrice(799, 5);
		huawei.calculateWeight(45.56, 5);
		huawei.calculateAvg(45.56, 5);
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec("Galaxy S7","GREY",1500,60.5,'N');
		samsung.calculatePrice(1500, 3);
		samsung.calculateWeight(60.5, 3);
		samsung.calculateAvg(60.5, 3);
		
		System.out.println("REDMI SPECIFICATION");
		redmi.printSpec("Redmi Note 8","Green",499,50.2,'Y');
		redmi.calculatePrice(499, 4);
		redmi.calculateWeight(50.2, 4);
		redmi.calculateAvg(50.2, 4);
		
		System.out.println("REALME SPECIFICATION");
		realme.printSpec("Realme7","Yellow",999,62.4,'Y');
		realme.calculatePrice(999, 6);
		realme.calculateWeight(62.4, 6);
		realme.calculateAvg(62.4, 6);
		
		System.out.println("NOKIA SPECIFICATION");
		nokia.printSpec("Nokia 3310","Blue",299,35.6,'N');
		nokia.calculatePrice(299, 7);
		nokia.calculateWeight(35.6, 7);
		nokia.calculateAvg(35.6, 7);
		
		System.out.println("POCO SPECIFICATION");
		poco.printSpec("M3","Gold",1499,67.2,'Y');
		poco.calculatePrice(1499, 8);
		poco.calculateWeight(67.2, 8);
		poco.calculateAvg(67.2, 8);
		
	}

}
