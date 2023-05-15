package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int count;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        count = 0;
    } 

    public void addDVD(DigitalVideoDisc dvd) {
        if (count < itemsInStore.length) {
            itemsInStore[count] = dvd;
            count++;
            System.out.println("DVD '" + dvd.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("The store is already full. Cannot add DVD '" + dvd.getTitle() + "'.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i].equals(dvd)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[count - 1] = null;
            count--;
            System.out.println("DVD '" + dvd.getTitle() + "' has been removed from the store.");
        } else {
            System.out.println("DVD '" + dvd.getTitle() + "' is not found in the store.");
        }
    }
    
    public void displayDVDs() {
        if (count == 0) {
            System.out.println("The store is empty. No DVDs available.");
        } else {
            System.out.println("DVDs in the store:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i]);
            }
        }
    }
}

