import java.util.Scanner;

public class joon2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count = count + n / 5;
                System.out.println(count);
                break;
            } else {
                n = n - 3;
                count++;
            }
            if (n < 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}
