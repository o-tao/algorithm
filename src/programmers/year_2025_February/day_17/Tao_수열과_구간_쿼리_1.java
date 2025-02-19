package programmers.year_2025_February.day_17;

import java.util.Arrays;

public class Tao_수열과_구간_쿼리_1 {

    public static void main(String[] args) {
        Tao_수열과_구간_쿼리_1 answer = new Tao_수열과_구간_쿼리_1();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1},{1, 2},{2, 3}};

        System.out.println(Arrays.toString(answer.solution(arr, queries)));
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}
