import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class joon11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        PriorityQueue<Integer> p = new PriorityQueue<>(100000, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(in.readLine());
            if (temp == 0) {
                if (p.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(p.poll().intValue()).append('\n');
                }
            } else {
                p.add(temp);
            }
        }
        System.out.println(sb);
    }
}
