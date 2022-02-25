import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int city = Integer.parseInt(in.readLine());
        long[] L = new long[city];
        long[] dis = new long[city - 1];

        StringTokenizer str = new StringTokenizer(in.readLine()," ");
        for (int i = 0; i < dis.length; i++)
            dis[i] = Long.parseLong(str.nextToken());

        str = new StringTokenizer(in.readLine()," ");
        for (int i = 0; i < L.length; i++)
            L[i] = Long.parseLong(str.nextToken());

        long sum = 0;
        long minCost = L[0];

        for(int i = 0; i < city - 1; i++) {
            if(L[i] < minCost) {
                minCost = L[i];
            }
            sum += (minCost * dis[i]);
        }
        System.out.println(sum);
    }
}
