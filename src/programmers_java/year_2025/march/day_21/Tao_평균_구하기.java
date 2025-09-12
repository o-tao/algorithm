package programmers_java.year_2025.march.day_21;

import java.util.Arrays;

public class Tao_평균_구하기 {

    public static void main(String[] args) {
        Tao_평균_구하기 tao = new Tao_평균_구하기();

        int[] arr = {1, 2, 3, 4};

        System.out.println(tao.solution(arr));
    }

    public String solution(int[] arr) {
        return String.valueOf(Arrays.stream(arr).average().orElse(0));
    }
}
