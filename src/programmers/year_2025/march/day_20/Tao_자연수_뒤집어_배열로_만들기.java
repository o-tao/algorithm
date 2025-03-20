package programmers.year_2025.march.day_20;

import java.util.Arrays;

public class Tao_자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        Tao_자연수_뒤집어_배열로_만들기 tao = new Tao_자연수_뒤집어_배열로_만들기();

        long n = 12345;

        System.out.println(Arrays.toString(tao.solution(n)));
    }

    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[str.length - 1 - i]);
        }

        return answer;
    }
}
