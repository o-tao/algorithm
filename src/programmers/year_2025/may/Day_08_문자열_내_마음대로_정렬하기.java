package programmers.year_2025.may;

import java.util.Arrays;
import java.util.Comparator;

public class Day_08_문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        Day_08_문자열_내_마음대로_정렬하기 tao = new Day_08_문자열_내_마음대로_정렬하기();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        System.out.println(Arrays.toString(tao.solution(strings, n)));
    }

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String s) -> s.charAt(n))
                        .thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
    }
}
