package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
            boolean prime[] = new boolean[246913];
            int count = 0;

            prime[0] = prime[1] = true;
            for (int i = 2; i <= Math.sqrt(prime.length); i++) {
                if (prime[i]) continue;
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) count++;
            }
            System.out.println(count);
        }
    }
}
