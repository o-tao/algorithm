package programmers_java.year_2025.June;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day_21_JadenCase_문자열_만들기 {

    public static void main(String[] args) {
        Day_21_JadenCase_문자열_만들기 tao = new Day_21_JadenCase_문자열_만들기();

        String s = "3people unFollowed me";

        System.out.println(tao.solution(s));
    }

    public String solution(String s) {
        return Arrays.stream(s.split(" ", -1))
                .map(word -> {
                    if (word.isEmpty()) return "";
                    char firstChar = word.charAt(0);
                    String rest = word.substring(1).toLowerCase();
                    return Character.toUpperCase(firstChar) + rest;
                })
                .collect(Collectors.joining(" "));
    }
}
