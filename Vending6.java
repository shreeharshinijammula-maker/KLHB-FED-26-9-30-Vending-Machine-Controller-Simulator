public class Vending6 {
    static int find(String[] items, String target) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(target)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] items = {"Chips", "Juice", "Candy"};
        int index = find(items, "Juice");

        System.out.println("JUICE -> " + (index >= 0 ? "FOUND" : "NOT FOUND"));
        System.out.println("MILK -> " + (find(items, "Milk") >= 0 ? "FOUND" : "NOT FOUND"));
        System.out.println("ARRAY CHECK: PASS");
    }
}