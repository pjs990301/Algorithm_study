package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];
        boolean flag = false;
        char c;
        for (int i = 0; i < T; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < str[0].length(); i++) {
            flag = false;
            for (int j = 0; j < T - 1; j++) {
                if (str[j].charAt(i) != str[j + 1].charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.print("?");
            else System.out.print(str[0].charAt(i));
        }
    }
}
