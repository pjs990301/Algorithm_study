package SWEA;

import java.io.*;
import java.util.StringTokenizer;

public class SWEA13550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int result = a;
            int mod = pow(10, 6) + 3; //1111 0100 0010 0100 0011 (10^6 + 3)
            for (int i = 1; i < n; i++) {
                result = ((result % mod) * ((a + i * d) % mod)) % mod;
            }
            if (test_case == T)
                out.write("#" + test_case + " " + result);
            else
                out.write("#" + test_case + " " + result + "\n");
        }
        out.flush();
        out.close();
    }

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;

        int temp = pow(a, b / 2);

        if (b % 2 == 0) {
            return (temp * temp);
        } else {
            return ((temp * temp) * a);
        }
    }
}