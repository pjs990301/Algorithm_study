package BaekJoon;

import java.util.Scanner;

public class joon1057 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        while(a != b) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            count++;
        }
        System.out.println(count);
    }
}
