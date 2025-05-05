package programmers.year_2025.may;

public class Day_05_콜라_문제 {

    public static void main(String[] args) {
        Day_05_콜라_문제 tao = new Day_05_콜라_문제();

        int a = 2;
        int b = 1;
        int n = 20;

        System.out.println(tao.solution(a, b, n));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchanged = (n / a) * b;
            answer += exchanged;
            n = (n % a) + exchanged;
        }

        return answer;
    }
}
