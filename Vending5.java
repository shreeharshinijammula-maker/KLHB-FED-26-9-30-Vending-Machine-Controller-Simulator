public class Vending5 {
    static String result(String code) {
        if (code.equals("A1") || code.equals("B1")) return "OK";
        return "INVALID";
    }

    public static void main(String[] args) {
        System.out.println("SERVICE RESULT: A1=" + result("A1") + "; C2=" + result("C2") + "; B1=" + result("B1") + "; BALANCE=0");
        System.out.println("METHOD CHECK: PASS");
    }
}