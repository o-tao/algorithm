package programmers.year_2025.June;

public class Day_24_숫자의_표현 {

    public static void main(String[] args) {
        Day_24_숫자의_표현 tao = new Day_24_숫자의_표현();

        int n = 15;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int start = 1, end = 1, sum = 1;

        while (start <= n) {
            if (sum == n) {
                answer++;
                sum -= start;
                start++;

            } else if (sum < n) {
                end++;
                if (end > n) break;
                sum += end;

            } else {
                sum -= start;
                start++;
            }
        }
        return answer;
    }
}
