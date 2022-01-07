import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class joon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+c+ "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
