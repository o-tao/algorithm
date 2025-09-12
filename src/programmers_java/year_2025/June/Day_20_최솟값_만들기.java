package programmers_java.year_2025.June;

import java.util.Arrays;

public class Day_20_최솟값_만들기 {

    public static void main(String[] args) {
        Day_20_최솟값_만들기 tao = new Day_20_최솟값_만들기();

        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println(tao.solution(A, B));
    }

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - 1 - i];
        }

        return answer;
    }
}
