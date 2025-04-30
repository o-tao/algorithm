package programmers.year_2025.april;

import java.util.Arrays;

public class Day_26_K번째수 {

    public static void main(String[] args) {
        Day_26_K번째수 tao = new Day_26_K번째수();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(tao.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int and = commands[i][1];
            int k = commands[i][2] - 1;

            int[] temp = Arrays.copyOfRange(array, start, and);

            Arrays.sort(temp);

            answer[i] = temp[k];
        }

        return answer;
    }
}
