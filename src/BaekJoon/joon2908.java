package BaekJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class joon2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        String n1 = st.nextToken();
        String n2 = st.nextToken();
        String temp = "";
        int num1 = 0, num2 = 0;
        for (int i = 2; i >= 0; i--) {
            temp += String.valueOf(n1.charAt(i));
        }
        num1 = Integer.parseInt(temp);
        temp = "";
        for (int i = 2; i >= 0; i--) {
            temp += String.valueOf(n2.charAt(i));
        }
        num2 = Integer.parseInt(temp);
        if (num1 < num2)
            System.out.println(num2);
        else if (num1 > num2)
            System.out.println(num1);
    }
}
