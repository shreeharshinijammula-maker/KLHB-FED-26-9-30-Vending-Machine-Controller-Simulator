public class VendingMachineBasics1 {

    public static void main(String[] args) {

        String product = "Chips";
        int price = 30;
        int quantity = 2;

        int total = price * quantity;

        System.out.println("================================");
        System.out.println("     VENDING MACHINE");
        System.out.println("================================");

        System.out.println("Product  : " + product);
        System.out.println("Price    : Rs." + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : Rs." + total);

        System.out.println("================================");
        System.out.println("Thank you for using the machine!");
    }
}