import java.io.*;
import java.util.StringTokenizer;

public class joon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {
            int sosuCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    sosuCount++;
            }
            if (sosuCount == 2) {
                out.write(i);
            }
        }
        out.flush();
        out.close();
    }
}
