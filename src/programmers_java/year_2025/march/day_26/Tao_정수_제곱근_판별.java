package programmers_java.year_2025.march.day_26;

public class Tao_정수_제곱근_판별 {

    public static void main(String[] args) {
        Tao_정수_제곱근_판별 tao = new Tao_정수_제곱근_판별();

        long n = 121;

        System.out.println(tao.solution(n));
    }

    public long solution(long n) {
        long answer = (long) Math.sqrt(n);
        return (answer * answer == n) ? (answer + 1) * (answer + 1) : -1;
    }
}
