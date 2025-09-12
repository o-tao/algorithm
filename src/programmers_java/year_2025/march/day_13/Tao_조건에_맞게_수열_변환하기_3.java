package programmers_java.year_2025.march.day_13;

import java.util.Arrays;

public class Tao_조건에_맞게_수열_변환하기_3 {

    public static void main(String[] args) {
        Tao_조건에_맞게_수열_변환하기_3 tao = new Tao_조건에_맞게_수열_변환하기_3();

        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        System.out.println(Arrays.toString(tao.solution(arr, k)));
    }

    public int[] solution(int[] arr, int k) {
        return k % 2 == 0 ? Arrays.stream(arr).map(i -> i + k).toArray() : Arrays.stream(arr).map(i -> i * k).toArray();
    }
}
