import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine());
        for (int i = 0; i < Case; i++) {
            String input = br.readLine();
            int count = 0, score = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else if (input.charAt(j) == 'X') {
                    count = 0;
                }
            }
            System.out.println(score);
        }

    }
}

