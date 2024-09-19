package Operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // 10 < a < 20
        boolean result = a > 10 && a < 20;
        System.out.println("result = " + result);
    }
}
