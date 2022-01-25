import java.util.Scanner;

public class joon1085 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        System.out.println(Math.min(Math.min(x,w-x),Math.min(y,h-y)));
    }
}
