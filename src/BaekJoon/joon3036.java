package BaekJoon;

import java.util.Scanner;

public class joon3036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int[] value = reduceFraction(arr[0], arr[i]);
            System.out.println(value[0] + "/" + value[1]);
        }

    }

    public static int[] reduceFraction(int bunja, int bunmo) {
        int[] frac = new int[2];
        frac[0] = bunja;
        frac[1] = bunmo;
        if (frac[1] == 0) {
            frac[0] = 0;
            frac[1] = 0;
            return frac;
        }
        int gcd_result = gcd(frac[0], frac[1]);
        frac[0] = frac[0] / gcd_result;
        frac[1] = frac[1] / gcd_result;
        return frac;
    }

    // Euclidean Algorithm
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

}
