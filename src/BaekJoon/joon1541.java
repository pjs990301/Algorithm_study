package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();

        int result = Integer.MAX_VALUE;
        String[] arr = input.split("-");

        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            String[] add = arr[i].split("\\+");

            for(int j = 0; j < add.length; j++) {
                temp += Integer.parseInt(add[j]);
            }
            if (result == Integer.MAX_VALUE) {
                result = temp;
            } else {
                result -= temp;
            }
        }
        System.out.println(result);
    }
}
