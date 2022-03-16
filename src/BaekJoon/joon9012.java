package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class joon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            boolean isVPS = true;
            Stack<Character> stack = new Stack();
            String input = in.readLine();
            char temp;
            for (int j = 0; j < input.length(); j++) {
                temp = input.charAt(j);
                if (temp == '(') {
                    stack.push(temp);
                } else if (temp == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty())
                isVPS = false;
            if (isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}

