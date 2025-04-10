package programmers.year_2025.april;

public class Day_10_문자열_다루기_기본 {

    public static void main(String[] args) {
        Day_10_문자열_다루기_기본 tao = new Day_10_문자열_다루기_기본();

        String s = "a234";

        System.out.println(tao.solution(s));
    }

    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.chars().allMatch(Character::isDigit);
    }
}
