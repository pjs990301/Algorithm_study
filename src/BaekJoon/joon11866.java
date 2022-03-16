package BaekJoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class joon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        Deque<Integer> que = new LinkedList();
        String result = "<";
        for (int i = n; i >= 1; i--) {
            que.push(i);
        }
        while (!que.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                que.offer(que.poll());
            }
            result += que.poll() + ", ";
        }
        result = result.substring(0,result.length()-2);
        result += ">";
        System.out.println(result);
    }
}
