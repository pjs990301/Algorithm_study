package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int count = 0;
        if (N < 100)
            count = N;
        else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;
                if (a - b == b - c)
                    count++;
            }
        }
        System.out.println(count);
    }
}
