package programmers.year_2025.may;

public class Day_20_소수_찾기 {

    public static void main(String[] args) {
        Day_20_소수_찾기 tao = new Day_20_소수_찾기();

        int n = 10;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
