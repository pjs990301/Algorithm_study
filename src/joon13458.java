import java.io.*;
import java.util.StringTokenizer;

public class joon13458 {
    public static void main(String[] args) throws IOException {
        //변수 선언 및 초기화
        int n;
        int b, c;
        long count = 0;

        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        //연산
        for (int i = 0; i < n; i++) {
            int t = a[i]-b;
            count++;
            if(t<=0) continue;
            if(t%c==0) {
                count += t/c;
            }else {
                count += t/c;
                count++;
            }
        }
        System.out.println((int)count);
    }
}
