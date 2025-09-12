package programmers_java.year_2025.march.day_21;

public class Tao_짝수와_홀수 {

    public static void main(String[] args) {
        Tao_짝수와_홀수 tao = new Tao_짝수와_홀수();

        int num = 3;

        System.out.println(tao.solution(num));
    }

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
