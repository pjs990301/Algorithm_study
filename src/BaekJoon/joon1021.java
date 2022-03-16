package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class joon1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        LinkedList<Integer> que = new LinkedList();
        for (int i = n; i >= 1; i--) {
            que.push(i);
        }

        int[] seq = new int[m];

        str = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < m; i++) {
            seq[i] = Integer.parseInt(str.nextToken());
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            int targetIdx = que.indexOf(seq[i]);
            int halfIdx;

            if (que.size() % 2 == 0) {
                halfIdx = que.size() / 2 - 1;
            } else {
                halfIdx = que.size() / 2;
            }

            if (targetIdx <= halfIdx) {
                while(seq[i]!=que.getFirst()){
                    que.add(que.removeFirst());
                    count++;
                }
            } else {
                while(seq[i]!=que.getFirst()){
                    que.addFirst(que.removeLast());
                    count++;
                }
            }
            que.pollFirst();
        }
        System.out.println(count);

    }

}

