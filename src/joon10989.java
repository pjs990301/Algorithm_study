import java.io.*;
import java.util.Arrays;

public class joon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            out.append(arr[i]).append('\n');
        }
        System.out.println(out);
    }
}
