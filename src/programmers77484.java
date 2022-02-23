import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class programmers77484 {
    public static void main(String[] args) {

        Solution77484 sc = new Solution77484();
        Scanner in = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(in.nextLine(), ", ");
        int[] lottos = new int[6];
        for (int i = 0; i < 6; i++) {
            lottos[i] = Integer.parseInt(str.nextToken());
        }
        int[] win_nums = new int[6];
        str = new StringTokenizer(in.nextLine(), ", ");

        for (int i = 0; i < 6; i++) {
            win_nums[i] = Integer.parseInt(str.nextToken());
        }
        System.out.println(sc.solution(lottos, win_nums));
    }
}

class Solution77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        ArrayList match = new ArrayList<>();
        int count = 0;
        int high = 0;
        int low = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0)
                count++;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j])
                    match.add(lottos);
            }
        }
        switch (match.size() + count) {
            case 6:
                high = 1;
                break;
            case 5:
                high = 2;
                break;
            case 4:
                high = 3;
                break;
            case 3:
                high = 4;
                break;
            case 2:
                high = 5;
                break;
            default:
                high = 6;
                break;
        }
        switch (match.size()) {
            case 6:
                low = 1;
                break;
            case 5:
                low = 2;
                break;
            case 4:
                low = 3;
                break;
            case 3:
                low = 4;
                break;
            case 2:
                low = 5;
                break;
            default:
                low = 6;
                break;
        }
        int[] answer = {high, low};
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}