package Operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean
        boolean result = a == b;
        System.out.println(result);
    }
}
