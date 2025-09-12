package programmers_java.year_2025.march.day_01;

import java.util.Arrays;

public class Tao_배열의_길이에_따라_다른_연산하기 {

    public static void main(String[] args) {
        Tao_배열의_길이에_따라_다른_연산하기 tao = new Tao_배열의_길이에_따라_다른_연산하기();

        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        System.out.println(Arrays.toString(tao.solution(arr, n)));
    }

    public int[] solution(int[] arr, int n) {
        for (int i = arr.length % 2 == 0 ? 1 : 0; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }
}
