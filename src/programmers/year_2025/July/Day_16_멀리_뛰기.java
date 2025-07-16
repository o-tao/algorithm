package programmers.year_2025.July;

public class Day_16_멀리_뛰기 {

    public static void main(String[] args) {
        Day_16_멀리_뛰기 tao = new Day_16_멀리_뛰기();

        int n = 4;

        System.out.println(tao.solution(n));
    }

    public long solution(int n) {
        long[] answer = new long[n + 2];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
}
