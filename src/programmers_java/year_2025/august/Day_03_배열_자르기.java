package programmers_java.year_2025.august;

import java.util.Arrays;

public class Day_03_배열_자르기 {
    public static void main(String[] args) {
        Day_03_배열_자르기 tao = new Day_03_배열_자르기();

        int n = 3;
        long left = 2;
        long right = 5;

        System.out.println(Arrays.toString(tao.solution(n, left, right)));
    }

    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[(int) (i - left)] = (int) (Math.max(row, col) + 1);
        }
        return answer;
    }
}
