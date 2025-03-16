package programmers.year_2025.march.day_16;

import java.util.Arrays;

public class Tao_정사각형으로_만들기 {

    public static void main(String[] args) {
        Tao_정사각형으로_만들기 tao = new Tao_정사각형으로_만들기();

        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        System.out.println(Arrays.deepToString(tao.solution(arr)));
    }

    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
