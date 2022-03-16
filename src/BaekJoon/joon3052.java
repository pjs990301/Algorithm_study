package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class joon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = Integer.parseInt(br.readLine()) % 42;
        }
        System.out.println(Arrays.stream(arr1).distinct().count());

    }
}
