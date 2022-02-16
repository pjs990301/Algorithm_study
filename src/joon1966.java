import java.io.*;
import java.util.*;

public class joon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(in.readLine());

        for (int i = 0; i < testCase; i++) {
            Deque<int[]> que = new LinkedList<>();
            StringTokenizer str = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(str.nextToken());
            int M = Integer.parseInt(str.nextToken());
            int count = 0;
            str = new StringTokenizer(in.readLine());

            for (int j = 0; j < N; j++)
                que.offer(new int[]{j, Integer.parseInt(str.nextToken())});

            while (true) {
                int now[] = que.remove();
                boolean flag = true;

                for (int q[] : que) {
                    if (q[1] > now[1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    if (now[0] == M)
                        break;
                } else {
                    que.add(now);
                }
            }
            out.write(count + "\n");
        }
        out.flush();
    }
}
