package programmers_java.year_2025.april;

import java.util.Arrays;

public class Day_11_행렬의_덧셈 {

    public static void main(String[] args) {
        Day_11_행렬의_덧셈 tao = new Day_11_행렬의_덧셈();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        System.out.println(Arrays.deepToString(tao.solution(arr1, arr2)));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
