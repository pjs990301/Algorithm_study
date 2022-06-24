package BaekJoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class joon1049 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MIN = Integer.MAX_VALUE;
        int[] pack = new int[M];
        int[] unit = new int[M];
        for (int i = 0; i < M; i++) {
            pack[i]= sc.nextInt();
            unit[i]= sc.nextInt();
        }
        Arrays.sort(pack);
        Arrays.sort(unit);

        MIN = Math.min(Math.min(((N/6)+1)*pack[0], N*unit[0]),((N/6))*pack[0] + (N%6)*unit[0]);
        System.out.println(MIN);
    }
}
