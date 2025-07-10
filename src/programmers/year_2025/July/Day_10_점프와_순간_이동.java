package programmers.year_2025.July;

public class Day_10_점프와_순간_이동 {

    public static void main(String[] args) {
        Day_10_점프와_순간_이동 tao = new Day_10_점프와_순간_이동();

        int n = 5;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                answer++;
                n--;
            }
            n /= 2;
        }

        return answer;
    }
}
