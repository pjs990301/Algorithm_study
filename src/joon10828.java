import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.StringTokenizer;

public class joon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            try {
                StringTokenizer str = new StringTokenizer(in.readLine());
                switch (str.nextToken()) {
                    case "push":
                        int pushNum = Integer.parseInt(str.nextToken());
                        stack.push(pushNum);
                        break;
                    case "pop":
                        System.out.println(stack.pop());
                        break;
                    case "size":
                        System.out.println(stack.size());
                        break;
                    case "empty":
                        if(stack.isEmpty() == true)
                            System.out.println("1");
                        else
                            System.out.println("0");
                        break;
                    case "top":
                        System.out.println(stack.lastElement());
                        break;
                }
            }
            catch (EmptyStackException e) {
                System.out.println("-1");
            }
            catch (NoSuchElementException e){
                System.out.println("-1");
            }
        }
    }
}
