public class Vending3 {
    // Calculates remaining balance after a purchase
    static int getBalance(int initial, int price) {
        return initial - price;
    }

    public static void main(String[] args) {
        int finalBalance = getBalance(10, 3);
        
        System.out.println("A1 -> DISPENSED; COST=3; BALANCE=" + finalBalance);
        System.out.println("STATUS: COMPLETED");
    }
}