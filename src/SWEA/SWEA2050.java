package SWEA;

import java.util.Scanner;

public class SWEA2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i)- 64+" ");
        }

    }
}
