package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int clock = h * 60 + m - 45;
        h = clock / 60;
        m = clock % 60;
        if (m < 0) {
            h = 23;
            m = 60 + m;
        }

        System.out.println(h + " " + m);
    }
}
