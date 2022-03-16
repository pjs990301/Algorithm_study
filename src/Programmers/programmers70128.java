package Programmers;

public class programmers70128 {
    public static void main(String[] args) {
        Solution70128 sc = new Solution70128();
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        System.out.println(sc.solution(a,b));
    }
}
class Solution70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length;i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}