package programmers_java.year_2025.march.day_15;

import java.util.Arrays;

public class Tao_특별한_이차원_배열_1 {

    public static void main(String[] args) {
        Tao_특별한_이차원_배열_1 tao = new Tao_특별한_이차원_배열_1();

        int n = 3;

        System.out.println(Arrays.deepToString(tao.solution(n)));
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
