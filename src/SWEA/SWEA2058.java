package SWEA;

import java.util.Scanner;

public class SWEA2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 10) { //9999
            sum += n / 1000; // sum +=9
            n = n % 1000; ///
            sum += n / 100;
            n = n % 100;
            sum += n / 10;
            n = n % 10;
            sum += n;
        }
        System.out.println(sum);

    }
}
