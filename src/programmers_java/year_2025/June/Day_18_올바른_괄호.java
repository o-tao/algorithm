package programmers_java.year_2025.June;

public class Day_18_올바른_괄호 {

    public static void main(String[] args) {
        Day_18_올바른_괄호 tao = new Day_18_올바른_괄호();

        String s = "()()";

        System.out.println(tao.solution(s));
    }

    public boolean solution(String s) {
        int answer = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                answer++;
            } else {
                answer--;
            }

            if (answer < 0) return false;
        }

        return answer == 0;
    }
}
