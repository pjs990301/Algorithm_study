package BaekJoon;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class joon11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        byte[] b = a.getBytes(StandardCharsets.US_ASCII);
        System.out.println(b[0]);
    }
}
