package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class joon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            int sosuCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    sosuCount++;
            }
            if (sosuCount == 2) {
                sum += i;
                if (i < min)
                    min = i;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
            exit(0);
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
