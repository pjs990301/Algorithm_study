package BaekJoon;

import java.util.Scanner;

public class joon1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int result = a.length();

        for (int i = 0; i < b.length() - a.length() + 1; i++) {
            int flag = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j + i)) {
                    flag++;
                }
            }
            if (result > flag) {
                result = flag;
            }
        }

        System.out.println(result);
    }
}
