import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class joon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int time = 0;
        int total = 0;
        StringTokenizer str = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(str.nextToken());

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            time = time + arr[i];
            total = time + total;
        }
        System.out.println(total);
    }
}
