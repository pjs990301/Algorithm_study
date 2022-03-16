package BaekJoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class joon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        Deque<Integer> que = new LinkedList();
        int value = 0;
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(in.readLine());
            switch (str.nextToken()) {
                case "push_front":
                    value = Integer.parseInt(str.nextToken());
                    que.addFirst(value);
                    break;

                case "push_back":
                    value = Integer.parseInt(str.nextToken());
                    que.addLast(value);
                    break;

                case "pop_front":
                    if (que.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(que.pollFirst().intValue());
                    break;

                case "pop_back":
                    if (que.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(que.pollLast().intValue());
                    break;

                case "size":
                    System.out.println(que.size());
                    break;

                case "empty":
                    if (que.isEmpty())
                        System.out.println('1');
                    else
                        System.out.println('0');
                    break;

                case "front":
                    if (que.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(que.getFirst().intValue());
                    break;

                case "back":
                    if (que.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(que.getLast().intValue());
                    break;

            }
        }
    }
}
