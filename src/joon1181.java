import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class joon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.readLine();
        }
        Arrays.sort(arr,(e1,e2)->{
            if(e1.length() == e2.length()){
                return e1.compareTo(e2);
            }
            else{
                return e1.length() - e2.length();
            }
        });
        System.out.println(arr[0]);

        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
