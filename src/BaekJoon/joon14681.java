package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        float x = Float.parseFloat(st.nextToken());
        st = new StringTokenizer(br.readLine());
        float y = Float.parseFloat(st.nextToken());

        if (x > 0) {
            if (y > 0)
                System.out.println("1");
            else if (y < 0)
                System.out.println("4");
        } else if (x < 0) {
            if (y > 0)
                System.out.println("2");
            else if (y < 0)
                System.out.println("3");
        }
    }
}
