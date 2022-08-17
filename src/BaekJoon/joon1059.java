package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class joon1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int l = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == l) {
                System.out.println(0);
                System.exit(0);
            }
        }

        if (arr[0] >= l) {
            count = (l - 0) * (arr[0] - l) - 1;
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] >= l) {
                    count = (l - arr[i - 1]) * (arr[i] - l) - 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }


}
