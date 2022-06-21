package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon1003 {
    static int zero_count;
    static int one_count;
    //재귀로 해결 해결X
    //다시 풀기
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            zero_count = 0;
            one_count = 0;
            int n = Integer.parseInt(in.readLine());
            fibonacci(n);
            sb.append(zero_count + " " + one_count).append("\n");
        }
        System.out.println(sb);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            zero_count++;
            return 0;
        } else if (n == 1) {
            one_count++;
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
