package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        double[] a = new double[T];
        for (int i = 0; i < T; i++) {
            StringTokenizer str = new StringTokenizer(in.readLine());
            double n = Double.parseDouble(str.nextToken());
            double r = Double.parseDouble(str.nextToken());
            a[i] = Combination(r, n);
            System.out.printf("%.0f\n", a[i]);
        }
    }

    public static double Combination(double n, double r) {
        double a = 1, b = 1;
        for (double i = n; i > (n - r); i--) {
            a *= i;
        }
        for (double i = 2; i <= r; i++) {
            b *= i;
        }
        return a / b;
    }
}
