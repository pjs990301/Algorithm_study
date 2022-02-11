import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class joon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < 9; i++){
            if(arr[i] == Arrays.stream(arr).max().getAsInt())
                idx = i;
        }
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(idx + 1);

    }
}
