package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class joon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b + 1];
        for (int i = a; i <= b; i++) {
            arr[i] = i;
        }
        for (int i = a; i <= b; i++) {
            if (arr[i] == 0) continue;
            for (int j = 2 * i; j <= b; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = a; i <= b; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }


    }
}
