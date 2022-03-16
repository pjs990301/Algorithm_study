package SWEA;

import java.util.Scanner;

public class SWEA1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] scores = new int[1000];
            int[] count = new int[101];
            int maxScore = 0;

            int tc = sc.nextInt();

            for (int j = 0; j < 1000; j++) {
                scores[j] = sc.nextInt();
                count[scores[j]]++;
            }
            for (int j = 0; j < count.length - 1; j++) {
                if (count[maxScore] <= count[j]) {
                    maxScore = j;
                }
            }
            System.out.println("#" + tc + " " + maxScore);
        }
    }
}
