package programmers_java.year_2025.march.day_29;

import java.util.Arrays;

public class Tao_없는_숫자_더하기 {

    public static void main(String[] args) {
        Tao_없는_숫자_더하기 tao = new Tao_없는_숫자_더하기();

        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        System.out.println(tao.solution(numbers));
    }

    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
