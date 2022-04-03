package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA2063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i+=1) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n/2]);
    }
}
