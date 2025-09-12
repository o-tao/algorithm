package programmers_java.year_2025.July;

public class Day_06_피보나치_수 {

    public static void main(String[] args) {
        Day_06_피보나치_수 tao = new Day_06_피보나치_수();

        int n = 3;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int mod = 1234567;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int answer = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            answer = (a + b) % mod;
            a = b;
            b = answer;
        }

        return answer;
    }
}
