package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class joon11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        if (n == 1) {
            exit(0);
        }
        int i = 2;
        while(n!=1){
            if(n%i==0){
                n = n / i;
                System.out.println(i);
            }
            else {
                i++;
            }
        }
    }
}
