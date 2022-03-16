package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class joon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] input = new int[n+1];
        ArrayList<Character> result = new ArrayList();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(in.readLine());
        }
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            result.add('+');
            while (!stack.empty() && stack.peek() == input[m]) {
                stack.pop();
                result.add('-');
                m++;
            }
        }

        if (stack.empty()) {
            for (Character s : result) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }
    }
}
