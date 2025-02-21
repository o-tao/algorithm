package programmers.year_2025_February.day_21;

import java.util.Arrays;

public class Tao_x_사이의_개수 {

    public static void main(String[] args) {
        Tao_x_사이의_개수 answer = new Tao_x_사이의_개수();

        String myString = "oxooxoxxox";

        System.out.println(Arrays.toString(answer.solution(myString)));
    }

    public int[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        int[] answer = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }
        return answer;
    }
}
