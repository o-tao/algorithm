package programmers.year_2025.april;

public class Day_30_숫자_문자열과_영단어 {

    public static void main(String[] args) {
        Day_30_숫자_문자열과_영단어 tao = new Day_30_숫자_문자열과_영단어();

        String s = "one4seveneight";

        System.out.println(tao.solution(s));
    }

    public int solution(String s) {
        String[] strNumbers = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < strNumbers.length; i++) {
            s = s.replaceAll(strNumbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
