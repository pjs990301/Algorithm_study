package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int[] arr = new int[10];
            for(int i = 0; i<10;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("#" + test_case + " " + Arrays.stream(arr).max().getAsInt());
        }
    }
}
