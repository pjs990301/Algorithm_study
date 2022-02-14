import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class joon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(in.readLine());
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}
