package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class joon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        Deque<Integer> que = new LinkedList();
        for(int i = 1; i<= n; i++){
            que.add(i);
        }
        while(true){
            if(que.size() == 1) {
                System.out.println(que.getLast());
                break;
            }
            que.pop();
            que.add(que.getFirst());
            que.pop();

        }

    }
}
