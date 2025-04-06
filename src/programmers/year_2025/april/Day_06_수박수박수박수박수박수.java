package programmers.year_2025.april;

public class Day_06_수박수박수박수박수박수 {

    public static void main(String[] args) {
        Day_06_수박수박수박수박수박수 tao = new Day_06_수박수박수박수박수박수();

        int n = 3;

        System.out.println(tao.solution(n));
    }

    public String solution(int n) {
        String answer = "수박";
        return answer.repeat((n / 2) + 1).substring(0, n);
    }
}
