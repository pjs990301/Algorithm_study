package BaekJoon;

import java.util.Scanner;

public class joon2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int layer = 1;
        int num = 0;
        int totalNum = 1;
        while (true) {
            if (n <= totalNum) {
                break;
            } else {
                num += 6;
                totalNum += num;
                layer++;
            }
        }
        System.out.println(layer);
    }
}
