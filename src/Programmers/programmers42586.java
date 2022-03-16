package Programmers;

import java.util.Stack;

public class programmers42586 {
    public static void main(String[] args) {

    }
}

class Solution42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < progresses.length; i++) {
            day[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
        }

        stack.push(0);
        for (int i = 1; i < day.length; i++) {
            if (day[i] > day[stack.peek()]) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (i == stack.size() - 1) {
                answer[i] = day.length - stack.elementAt(i);

            } else {
                answer[i] = stack.elementAt(i + 1) - stack.elementAt(i);
            }
        }
        return answer;
    }
}