package BaekJoon;

import java.util.Scanner;

public class joon1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int cross_count = 1, prev_count_sum = 0;

        while (true) {
            if (n <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {
                    System.out.print((cross_count - (n - prev_count_sum - 1)) + "/" + (n - prev_count_sum));
                    break;
                } else {
                    System.out.print((n - prev_count_sum) + "/" + (cross_count - (n - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
