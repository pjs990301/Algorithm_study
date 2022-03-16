package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer str = new StringTokenizer(in.readLine());
            long a = Long.parseLong(str.nextToken());
            long b = Long.parseLong(str.nextToken());
            int r = 1;
            for(int j = 0; j<b;j++){
                r = (int) ((a * r) %10);
            }
            if(r == 0) r = 10;
            System.out.println(r);
        }

    }
}
