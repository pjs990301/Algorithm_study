package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class joon13458 {

    public static void main(String[] args) throws IOException {
        long count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        int i;
        for(i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for(i = 0; i < n; ++i) {
            int t = a[i] - b;
            ++count;
            if (t > 0) {
                if (t % c == 0) {
                    count += (long)(t / c);
                } else {
                    count += (long)(t / c);
                    ++count;
                }
            }
        }

        System.out.println((int)count);
    }
}
