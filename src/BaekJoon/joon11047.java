package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        int value = Integer.parseInt(str.nextToken());
        int count = 0;
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(in.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (value >= coin[i]) {
                count += value / coin[i];
                value = value % coin[i];
            }

        }
        System.out.println(count);
    }
}

