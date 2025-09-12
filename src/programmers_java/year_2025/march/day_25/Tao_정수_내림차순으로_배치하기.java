package programmers_java.year_2025.march.day_25;

import java.util.Arrays;

public class Tao_정수_내림차순으로_배치하기 {

    public static void main(String[] args) {
        Tao_정수_내림차순으로_배치하기 tao = new Tao_정수_내림차순으로_배치하기();

        long n = 118372;

        System.out.println(tao.solution(n));
    }

    public long solution(long n) {
        char[] answer = String.valueOf(n).toCharArray();
        Arrays.sort(answer);
        StringBuilder sb = new StringBuilder(new String(answer));
        return Long.parseLong(sb.reverse().toString());
    }
}
