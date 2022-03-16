package SWEA;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class SWEA2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        //Case 1) Stream을 이용
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] arr = new int[10];
            for(int i = 0; i < 10; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("#" + test_case + " " + Math.round((stream(arr).average().getAsDouble())));

        }
        System.out.println();
        //Case 2) //Sum을 이용
        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for(int i = 0; i < 10; i++){
                sum += sc.nextInt();
            }
            System.out.format( "#%d %.0f\n", test_case, sum/10.0);
        }
    }
}
