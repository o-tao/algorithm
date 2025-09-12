package programmers_java.year_2025.april;

public class Day_03_가운데_글자_가져오기 {

    public static void main(String[] args) {
        Day_03_가운데_글자_가져오기 tao = new Day_03_가운데_글자_가져오기();

        String s = "abcde";

        System.out.println(tao.solution(s));
    }

    public String solution(String s) {
        int length = s.length();
        return length % 2 == 0 ? s.substring(length / 2 - 1, length / 2 + 1) : s.substring(length / 2, length / 2 + 1);
    }
}
