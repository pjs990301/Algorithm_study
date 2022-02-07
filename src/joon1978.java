import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        int num[] = new int[n];
        StringTokenizer str = new StringTokenizer(in.readLine());

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken(" "));
        }
        for (int i = 0; i < n; i++) {
            int sosuCount = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0)
                    sosuCount++;
            }
            if (sosuCount == 2)
                count++;
        }
        System.out.println(count);
    }
}
