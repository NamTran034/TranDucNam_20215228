package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		// Create a new cart 
		Cart anOrder = new Cart();
		
		// Create new dvd objects and add them to the cart 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1); 
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// print total cost of the items in the cart 
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		// test the removeDigitalVideoDisc(DigitalVideoDisc disc) method
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.print("Total cost after remove: ");
		System.out.println(anOrder.totalCost());
	}
}