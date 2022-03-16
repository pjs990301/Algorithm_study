package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class joon10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int num1 = Integer.valueOf(str.nextToken());
            int num2 = Integer.valueOf(str.nextToken());
            if(num1 == 0 && num2 == 0) break;
            int sum = num1 + num2;
            System.out.println(sum);
        }
    }
}
  
 
