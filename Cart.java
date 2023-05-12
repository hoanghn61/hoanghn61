package lab_02;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrders[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full!");
		}else {
			itemsOrders[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
			
		}
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		qtyOrdered -= 1;
		System.out.println("Success reomoval"); 

	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrders[i].getCost();
			
		}return total;
		
		
	}
	
	

}
