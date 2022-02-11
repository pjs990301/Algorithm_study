import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String result = String.valueOf(a * b * c);
        int [][] arr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = Integer.parseInt(String.valueOf(i));
            arr[i][1] = Integer.parseInt(String.valueOf(0));
        }
        for (int i = 0; i < result.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[j][0] == Integer.parseInt(String.valueOf(result.charAt(i)))) {
                    arr[j][1]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
                System.out.println(arr[i][1]);
        }
    }
}
