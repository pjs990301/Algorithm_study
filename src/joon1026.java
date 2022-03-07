import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class joon1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringTokenizer str = new StringTokenizer(in.readLine(), " ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(in.readLine(), " ");
        int[] b = new int[str.countTokens()];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i];
        }
        System.out.println(sum);


    }
}
