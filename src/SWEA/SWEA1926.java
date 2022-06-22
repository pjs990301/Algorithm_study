package SWEA;

import java.util.Scanner;

public class SWEA1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String temp = String.valueOf(test_case);
            if (temp.contains("3") || temp.contains("6") || temp.contains("9")) {
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(test_case + " ");
            }
        }
    }
}

