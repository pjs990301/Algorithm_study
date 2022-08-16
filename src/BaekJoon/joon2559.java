package BaekJoon;

import java.util.Scanner;

public class joon2559 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i, j = 0;
        // 입력 받기
        for (i = 0; i < size; i++)
            arr[i] = in.nextInt();

        // max값 찾기
        for (i = 0; i < size - n + 1; i++) {
            for (j = 0; j < n; j++) {
                sum += arr[j + i];
            }
            max = Math.max(max, sum);
            sum = 0;
        }
        System.out.println(max);
    }
}
