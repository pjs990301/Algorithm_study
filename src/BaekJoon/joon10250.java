package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class joon10250 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int count = 0;

            for(int a = 1; a <= W; a++){
                for(int b = 1; b <= H; b++){
                    count++;
                    if(count == N){
                        if(a < 10)
                            System.out.println(b+ "0"+a);
                        else {
                            System.out.print(b);
                            System.out.println(a);
                        }
                    }
                }
            }

        }

    }
}
