import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class joon10818 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());
    }
}
