# KLHB-FED-26-9-30-Vending Machine Controller Simulator
By Harshini - 2620040066, Mahima - 2620030076
import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Product details
        String[] products = {"Coke", "Pepsi", "Water", "Chips", "Chocolate"};
        double[] prices = {40, 40, 20, 30, 50};

        double total = 0;
        int choice;
        int quantity;
        char again;

        System.out.println("=================================");
        System.out.println("       WELCOME TO VENDING        ");
        System.out.println("            MACHINE              ");
        System.out.println("=================================");

        do {
            // Display products
            System.out.println("\nAvailable Products:");
            System.out.println("1. Coke       - Rs.40");
            System.out.println("2. Pepsi      - Rs.40");
            System.out.println("3. Water      - Rs.20");
            System.out.println("4. Chips      - Rs.30");
            System.out.println("5. Chocolate  - Rs.50");

            // User selects product
            System.out.print("\nEnter your choice (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                double amount = prices[choice - 1] * quantity;
                total = total + amount;

                System.out.println("You selected: " + products[choice - 1]);
                System.out.println("Quantity: " + quantity);
                System.out.println("Amount: Rs." + amount);

            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to buy another product? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        // Display total
        System.out.println("\n=================================");
        System.out.println("          BILL DETAILS           ");
        System.out.println("=================================");
        System.out.println("Total Amount: Rs." + total);

        // Payment
        System.out.print("Enter payment amount: Rs.");
        double payment = sc.nextDouble();

        if (payment >= total) {

            double change = payment - total;

            System.out.println("Payment successful!");
            System.out.println("Change returned: Rs." + change);

        } else {

            double remaining = total - payment;

            System.out.println("Insufficient payment!");
            System.out.println("Please pay Rs." + remaining + " more.");
        }

        System.out.println("\nThank you for using the Vending Machine!");
        System.out.println("=================================");

        sc.close();
    }
}
