package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class joon10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        BigInteger A = new BigInteger(str.nextToken());
        BigInteger B = new BigInteger(str.nextToken());

        System.out.println(A.add(B));


    }
}
