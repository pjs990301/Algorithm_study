import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int[] arr = new int[N];
        int temp = 0;
        int sum = 0;
        str = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (temp < sum && sum <= M) {
                        temp = sum;

                    }
                }
            }
        }
        System.out.println(temp);
    }
}
