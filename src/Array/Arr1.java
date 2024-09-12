package Array;

public class Arr1 {
    public static void main(String[] args) {
        int[] score = new int[10];

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println();
        // 향상된 for 문
        // for ( 타입 변수명 : 배열 또는 컬렉션 ) {
        //      반복할 문장
        // }
        for (int j : score) {
            System.out.println(j);
        }
        System.out.println();

        int[] arr = {10, 20, 30, 40, 50};
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p]);
        }
        System.out.println();
        for(int k : arr) {
            System.out.println(k);
        }

    }
}
