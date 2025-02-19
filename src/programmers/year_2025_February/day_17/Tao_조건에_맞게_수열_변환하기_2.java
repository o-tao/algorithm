package programmers.year_2025_February.day_17;

import java.util.Arrays;

public class Tao_조건에_맞게_수열_변환하기_2 {

    public static void main(String[] args) {
        Tao_조건에_맞게_수열_변환하기_2 answer = new Tao_조건에_맞게_수열_변환하기_2();

        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(answer.solution(arr));
    }

    public int solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int count = 0;

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, answer)) {
                break;
            }

            answer = Arrays.copyOf(arr, arr.length);

            count++;
        }

        return count;
    }
}
