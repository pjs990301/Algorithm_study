import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class programmers92334 {
    public static void main(String[] args) throws IOException {
        Solution92334 sc = new Solution92334();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] id_list = new String[1000];
        String[] report = new String[20000];
        int k = 0;
        /*input
        "muzi", "frodo", "apeach", "neo"
        "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
        2
        */
        StringTokenizer stringTokenizer = new StringTokenizer(in.readLine(), ", ");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            id_list[i] = stringTokenizer.nextToken();
            id_list[i] = id_list[i].substring(1, id_list[i].length() - 1);
            i++;
        }
        stringTokenizer = new StringTokenizer(in.readLine(), ",");
        i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            report[i] = stringTokenizer.nextToken();
            report[i] = report[i].substring(1, report[i].length() - 1);
            i++;
        }
        k = Integer.parseInt(in.readLine());
        sc.solution(id_list, report, k);
    }
}

class Solution92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        String[][] arr = new String[1000][3];
        int[] count = new int[1000];
        int i = 0;
        while (id_list[i] != null) {
            arr[i][0] = id_list[i];
            i++;
        }
        i = 0;
        while (report[i] != null) {
            String[] temp = report[i].split(" ");
            for (int j = 0; id_list[j] != null; j++) {
                if (id_list[j] == temp[0]) {
                    arr[i][1] = report[i];
                }
            }
            i++;
        }


        int[] answer = {};
        return answer;
    }
}
