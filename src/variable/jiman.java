package variable;

import java.util.Scanner;

public class jiman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 개의 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        // plus 메서드 호출
        plus(a, b);

        // 스캐너 닫기
        scanner.close();
    }

    public static int plus(int a, int b) {
        System.out.println("첫 번째 정수: " + a);
        System.out.println("두 번째 정수: " + b);
//        System.out.println(c);
        return 0; // 현재는 0을 반환하지만, 필요에 따라 수정할 수 있습니다.
    }

    public static int plusPlus(int a, int b) {
        return a + b;
    }
}
