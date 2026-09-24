public class Vending2 {
    static boolean checkItemCode(String code) {
        return code.equals("E1") || code.equals("F2") || code.equals("G3");
    }

    public static void main(String[] args) {
        System.out.println("SLOT X9 -> " + (checkItemCode("X9") ? "DISPENSING" : "OUT OF STOCK"));
        System.out.println("SLOT F2 -> " + (checkItemCode("F2") ? "DISPENSING" : "OUT OF STOCK"));
        System.out.println("SYSTEM STATUS: ONLINE");
    }
}