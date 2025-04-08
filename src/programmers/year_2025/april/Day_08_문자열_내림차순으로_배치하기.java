package programmers.year_2025.april;

import java.util.stream.Collectors;

public class Day_08_문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {
        Day_08_문자열_내림차순으로_배치하기 tao = new Day_08_문자열_내림차순으로_배치하기();

        String s = "Zbcdefg";

        System.out.println(tao.solution(s));
    }

    public String solution(String s) {
        return s.chars().mapToObj(c -> (char) c).sorted((a, b) -> b - a).map(String::valueOf).collect(Collectors.joining());
    }
}
