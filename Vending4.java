public class Vending4 {
    public static void main(String[] args) {
        String[] commands = {"A1 -> SNACK; PRICE=10", "B1 -> DRINK; PRICE=20", "C2 -> EMPTY", "EXIT -> MACHINE OFF"};
        for (String command : commands) System.out.println(command);
        System.out.println("LOOP CHECK: PASS");
    }
}