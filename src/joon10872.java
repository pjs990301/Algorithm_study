import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon10872 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(cal(n));
    }

    public static int cal(int n) {
        if (n <= 1) return 1;
        return n * cal(n - 1);
    }
}
