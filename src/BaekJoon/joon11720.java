package BaekJoon;

import java.util.Scanner;

public class joon11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
