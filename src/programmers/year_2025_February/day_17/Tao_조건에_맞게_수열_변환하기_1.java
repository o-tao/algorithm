package programmers.year_2025_February.day_17;

import java.util.Arrays;

public class Tao_조건에_맞게_수열_변환하기_1 {

    public static void main(String[] args) {
        Tao_조건에_맞게_수열_변환하기_1 answer = new Tao_조건에_맞게_수열_변환하기_1();

        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(Arrays.toString(answer.solution(arr)));
    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
