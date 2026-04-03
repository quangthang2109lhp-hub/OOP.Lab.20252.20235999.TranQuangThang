import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f); // Using the constructor with
																						// title and cost only
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 25.00f);

		ArrayList<DigitalVideoDisc> availableDVDs = new ArrayList<>();
		availableDVDs.add(dvd1);
		availableDVDs.add(dvd2);
		availableDVDs.add(dvd3);
		availableDVDs.add(dvd4);

		Scanner scanner = new Scanner(System.in);
		String choice;

		do {
			System.out.println("\n1. Display DVDs available for selection");
			System.out.println("2. Add a DVD to the cart");
			System.out.println("3. Remove a DVD from the cart");
			System.out.println("4. Display current cart items");
			System.out.println("5. Display total cost of the cart");
			System.out.println("Press '#' to exit the program");
			System.out.print("Enter your choice: ");
			choice = scanner.nextLine();

			switch (choice) {
			case "1":
				System.out.println("\nAvailable DVDs:");
				for (int i = 0; i < availableDVDs.size(); i++) {
					DigitalVideoDisc dvd = availableDVDs.get(i);
					System.out.println((i + 1) + ". " + dvd.getTitle() + " - " + dvd.getCost());
				}
				break;

			case "2":
				System.out.print("Enter the number of the DVD to add (1-" + availableDVDs.size() + "): ");
				int addChoice = Integer.parseInt(scanner.nextLine());
				if (addChoice >= 1 && addChoice <= availableDVDs.size()) {
					anOrder.addDigitalVideoDisc(availableDVDs.get(addChoice - 1));
				} else {
					System.out.println("Invalid choice. Please try again.");
				}
				break;

			case "3":
				System.out.print("Enter the number of the DVD to remove (1-" + availableDVDs.size() + "): ");
				int removeChoice = Integer.parseInt(scanner.nextLine());
				if (removeChoice >= 1 && removeChoice <= availableDVDs.size()) {
					anOrder.removeDigitalVideoDisc(availableDVDs.get(removeChoice - 1));
				} else {
					System.out.println("Invalid choice. Please try again.");
				}
				break;

			case "4":
				anOrder.DisplayCart();
				break;

			case "5":
				anOrder.totalCost();
				break;

			case "#":
				System.out.println("Exiting the program.");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		} while (!choice.equals("#"));

		scanner.close();
	}
}