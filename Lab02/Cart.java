import java.util.ArrayList;
import java.util.List;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<>();
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (itemsOrdered.size() + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc disc : dvdList) {
                itemsOrdered.add(disc);
            }
            System.out.println(dvdList.length + " discs have been added.");
        } else {
            System.out.println("Not enough space in the cart for all the DVDs.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;

        if (itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc isn't in the cart yet.");
        }
    }
    public float totalCost() {
        if (itemsOrdered.isEmpty()) {
            return 0.0f; 
        }
        float total = 0;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            total += dvd.getCost();
        }
        return total;
    }
    public void DisplayCart() {
        System.out.println("Your cart contains the following items:");
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty. Cost = 0");
        } else {
            for (DigitalVideoDisc dvd : itemsOrdered) {
                System.out.println("Title: " + dvd.getTitle() + ", Cost: " + dvd.getCost());
            }
        }
    }
    public void displayTotalCost() {
        float total = totalCost();
        System.out.println("Total cost of your cart: " + total);
    }
}