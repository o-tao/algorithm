package programmers.year_2025.march.day_20;

public class Tao_자릿수_더하기 {

    public static void main(String[] args) {
        Tao_자릿수_더하기 tao = new Tao_자릿수_더하기();

        int n = 123;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
