package SWEA;

import java.util.Scanner;

public class SWEA2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = 1;
        System.out.print(pow + " ");
        for (int i = 1; i <= n; i++) {
            pow = pow * 2;
            System.out.print(pow + " ");
        }
    }
}
