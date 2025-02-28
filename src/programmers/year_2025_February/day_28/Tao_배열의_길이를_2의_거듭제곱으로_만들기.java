package programmers.year_2025_February.day_28;

import java.util.Arrays;

public class Tao_배열의_길이를_2의_거듭제곱으로_만들기 {

    public static void main(String[] args) {
        Tao_배열의_길이를_2의_거듭제곱으로_만들기 tao = new Tao_배열의_길이를_2의_거듭제곱으로_만들기();

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(tao.solution(arr)));
    }

    public int[] solution(int[] arr) {
        int temp = 1;
        while (temp < arr.length) {
            temp *= 2;
        }

        int[] answer = new int[temp];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
