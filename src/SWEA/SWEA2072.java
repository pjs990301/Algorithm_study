package SWEA;

import java.util.Scanner;

public class SWEA2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int n = sc.nextInt();
                if (n % 2 == 1)
                    sum += n;
            }
            System.out.print("#" + test_case + " ");
            System.out.println(sum);
        }
    }
}
