package programmers_java.year_2025.april;

import java.util.stream.Collectors;

public class Day_23_시저_암호 {

    public static void main(String[] args) {
        Day_23_시저_암호 tao = new Day_23_시저_암호();

        String s = "AB";
        int n = 1;

        System.out.println(tao.solution(s, n));
    }

    public String solution(String s, int n) {
        return s.chars()
                .mapToObj(c -> {
                    if (c == ' ') return " ";
                    if (Character.isUpperCase(c))
                        return String.valueOf((char) ((c - 'A' + n) % 26 + 'A'));
                    if (Character.isLowerCase(c))
                        return String.valueOf((char) ((c - 'a' + n) % 26 + 'a'));
                    return String.valueOf((char) c);
                })
                .collect(Collectors.joining());
    }
}
