package SWEA;

import java.util.Scanner;

public class SWEA2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
                System.out.println("#" + test_case + " > ");
            else if(a<b)
                System.out.println("#" + test_case + " < ");
            else
                System.out.println("#" + test_case + " = ");
        }
    }
}
