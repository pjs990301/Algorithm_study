import java.util.Scanner;

public class programmers81301 {
    public static void main(String[] args) {
        Solution81301 sc = new Solution81301();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(sc.solution(input));
    }
}

class Solution81301 {
    public int solution(String s) {
        String[] arr1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for(int i = 0; i < 10; i++){
            s = s.replace(arr1[i] , arr2[i]);
        }
        return Integer.parseInt(s);
    }
}