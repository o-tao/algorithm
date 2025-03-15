package programmers.year_2025.march.day_15;

import java.util.Arrays;

public class Tao_정수를_나선형으로_배치하기 {

    public static void main(String[] args) {
        Tao_정수를_나선형으로_배치하기 tao = new Tao_정수를_나선형으로_배치하기();

        int n = 4;

        System.out.println(Arrays.deepToString(tao.solution(n)));
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int idx = 1;
        int rowStart = 0, colStart = 0;
        int rowEnd = n - 1, colEnd = n - 1;

        while (idx <= n * n) {
            // →
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = idx++;
            }
            rowStart++;

            // ↓
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = idx++;
            }
            colEnd--;

            // ←
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = idx++;
            }
            rowEnd--;

            // ↑
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = idx++;
            }
            colStart++;

        }

        return answer;
    }
}
