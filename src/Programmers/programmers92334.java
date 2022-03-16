package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class programmers92334 {
    public static void main(String[] args) throws IOException {
        Solution92334 sc = new Solution92334();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        int k = 0;
        /*
        input case1
        "muzi", "frodo", "apeach", "neo"
        "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
        2

        input case2
        "con", "ryan"
        "ryan con", "ryan con", "ryan con", "ryan con"
        3
        */
        StringTokenizer stringTokenizer = new StringTokenizer(in.readLine(), ", ");
        int i = 0;
        String[] id_list = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            id_list[i] = stringTokenizer.nextToken();
            id_list[i] = id_list[i].substring(1, id_list[i].length() - 1);
            i++;
        }
        stringTokenizer = new StringTokenizer(in.readLine(), ",");
        i = 0;
        String[] report = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            report[i] = stringTokenizer.nextToken();
            report[i] = report[i].substring(1, report[i].length() - 1);
            i++;
        }
        k = Integer.parseInt(in.readLine());
        for (int j = 0; j < id_list.length; j++)
            System.out.println(Arrays.stream(sc.solution(id_list, report, k)).toArray()[j]);
    }
}

class Solution92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> reporterArr = new HashMap<>();
        HashMap<String, Integer> singoArr = new HashMap<>();

        for (String id : id_list) {
            singoArr.put(id, 0);
            reporterArr.put(id, new HashSet<String>());
        }
        for (String cur : report) {
            StringTokenizer str = new StringTokenizer(cur, " ");
            String reporter = str.nextToken();
            String singo = str.nextToken();
            if (reporterArr.get(reporter).add(singo)) {
                singoArr.put(singo, singoArr.get(singo).intValue() + 1);
            }
        }
        for (String cur : report) {
            StringTokenizer str = new StringTokenizer(cur, " ");
            String reporter = str.nextToken();
            String singo = str.nextToken();
            if (singoArr.get(singo).intValue() < k) {
                reporterArr.get(reporter).remove(singo);
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterArr.get(id_list[i]).size();
        }
        return answer;
    }
}
