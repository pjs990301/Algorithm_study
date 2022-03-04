import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class programmers42576 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(in.readLine(), ", ");
        String[] participant = new String[stringTokenizer.countTokens()];
        int i = 0;
        /*
        input case1
        "leo", "kiki", "eden"
        "eden", "kiki"

        input case2
        "mislav", "stanko", "mislav", "ana"
        "stanko", "ana", "mislav"
        */
        while (stringTokenizer.hasMoreTokens()) {
            participant[i] = stringTokenizer.nextToken();
            participant[i] = participant[i].substring(1, participant[i].length() - 1);
            i++;
        }
        stringTokenizer = new StringTokenizer(in.readLine(), ",");
        String[] completion = new String[stringTokenizer.countTokens()];
        i = 0;

        while (stringTokenizer.hasMoreTokens()) {
            completion[i] = stringTokenizer.nextToken();
            completion[i] = completion[i].substring(1, completion[i].length() - 1);
            i++;
        }

        Solution42576 sc = new Solution42576();
        System.out.println(sc.solution(participant, completion));
    }
}

class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion)
            hm.put(player, hm.get(player) - 1);
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                System.out.println(answer);
                break;
            }
        }
        return answer;

    }
}