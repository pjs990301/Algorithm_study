package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class joon2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(arr);
        System.out.println(Math.round(Arrays.stream(arr).average().getAsDouble()));
        System.out.println(arr[arr.length / 2]);
        System.out.println(manny(arr));
        System.out.println(Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt());
    }

    static int manny(int[] arr) {
        int cnt[] = new int[8001];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x < 0) {
                cnt[Math.abs(x) + 4000]++;
            } else cnt[x]++;
        }
        int idx = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0 && cnt[i] > max) {
                max = cnt[i];
                idx = i;
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            int x = i;
            if (cnt[i] == max) {
                if (i > 4000) {
                    x -= 4000;
                    x *= -1;
                    arrayList.add(x);
                } else
                    arrayList.add(i);
            }
        }
        Collections.sort(arrayList);

        if (arrayList.size() > 1) return arrayList.get(1);
        else return arrayList.get(0);
    }
}
