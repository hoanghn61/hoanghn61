package lab_02;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dcd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f );
		anOrder.addDigitalVideoDisc(dcd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sciece fiction","Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: " + anOrder.totalCost());
		
		
		
	}

}
