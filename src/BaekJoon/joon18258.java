package BaekJoon;

import java.io.*;
import java.util.*;

public class joon18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        Deque<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(in.readLine());
            switch (str.nextToken()) {
                case "push":
                    int pushNum = Integer.parseInt(str.nextToken());
                    queue.add(pushNum);
                    break;
                case "pop":
                    if (queue.isEmpty() == true)
                        out.write("-1" + "\n");
                    else
                        out.write(queue.remove() + "\n");
                    break;
                case "size":
                    out.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty() == true)
                        out.write("1" + "\n");
                    else
                        out.write("0" + "\n");
                    break;
                case "front":
                    if (queue.isEmpty() == true)
                        out.write("-1" + "\n");
                    else
                        out.write(queue.peek() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty() == true)
                        out.write("-1" + "\n");
                    else
                        out.write(queue.peekLast() + "\n");
                    break;
            }
        }
        out.flush();
        out.close();
    }
}
