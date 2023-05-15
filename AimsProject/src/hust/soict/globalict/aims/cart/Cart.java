package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full!");
            return;
        }
        
        itemOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added to the cart.");
    }
    
// 	Add a list of DVDs to the cart 
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }
    
//	Pass an arbitrary number of arguments for dvd
//  public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//      for (DigitalVideoDisc disc : dvdList) {
//          addDigitalVideoDisc(disc);
//      }
//  }
    
// Add two DVDs together
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                qtyOrdered--;
                itemOrdered[qtyOrdered] = null;
                System.out.println("The disc has been removed from the cart.");
                return;
            }
        }
        System.out.println("The disc is not found in the cart.");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
    
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getID() == id) {
                System.out.println("Search results for DVD ID " + id + ":");
                System.out.println(itemOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No matching DVD found with ID " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for DVD title: " + title);
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                System.out.println(itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching DVDs found with title: " + title);
        }
    }
}