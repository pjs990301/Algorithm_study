import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class joon4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(str.nextToken(" "));
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > Arrays.stream(arr).average().getAsDouble()) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f%%", (double)count / n * 100));

        }
    }
}
