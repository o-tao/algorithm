package programmers_java.year_2025.may;

import java.util.Arrays;

public class Day_17_과일_장수 {

    public static void main(String[] args) {
        Day_17_과일_장수 tao = new Day_17_과일_장수();

        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(tao.solution(k, m, score));
    }

    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;

        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}
