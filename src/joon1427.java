import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class joon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        Integer[] arr = new Integer[str.length()];
        for(int i = 0; i < str.length();i++){
            arr[i] = Integer.valueOf((int)str.charAt(i) - '0');
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
