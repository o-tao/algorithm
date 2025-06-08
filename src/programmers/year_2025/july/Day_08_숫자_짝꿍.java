package programmers.year_2025.july;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day_08_숫자_짝꿍 {

    public static void main(String[] args) {
        Day_08_숫자_짝꿍 tao = new Day_08_숫자_짝꿍();

        String X = "100";
        String Y = "2345";

        System.out.println(tao.solution(X, Y));
    }

    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];

        X.chars().forEach(c -> x[c - '0']++);
        Y.chars().forEach(c -> y[c - '0']++);

        String answer = IntStream.rangeClosed(0, 9)
                .map(i -> 9 - i)
                .mapToObj(i -> String.valueOf(i).repeat(Math.min(x[i], y[i])))
                .collect(Collectors.joining());

        if (answer.isEmpty()) {
            return "-1";

        } else if (answer.charAt(0) == '0') {
            return "0";

        } else {
            return answer;
        }
    }
}
