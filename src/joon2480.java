import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class joon2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(10000 + arr[0] * 1000);
        }else if(arr[0] == arr[1] || arr[0] == arr[2]) {
            System.out.println(1000 + arr[0] * 100);
        }else if(arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        }else {
            System.out.println(Arrays.stream(arr).max().getAsInt() * 100);
        }

    }
}
