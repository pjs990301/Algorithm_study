import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SWEA9658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            String[] tmp = br.readLine().split("");
            int[] arr = new int[tmp.length];

            for (int i = 0; i < tmp.length; i++)
                arr[i] = Integer.parseInt(tmp[i]);

            int cnt = arr.length - 1;

            if (arr[2] >= 5)
                arr[1]++;

            if (arr[1] == 10) {
                arr[0]++;
                arr[1] = 0;
            }

            if (arr[0] == 10) {
                arr[0] = 1;
                cnt++;
            }
            System.out.println("#" + test_case + " " + arr[0] + "." + arr[1] + "*10^" + cnt);
        }
    }
}
