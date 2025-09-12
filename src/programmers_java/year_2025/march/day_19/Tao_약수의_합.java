package programmers_java.year_2025.march.day_19;

import java.util.stream.IntStream;

public class Tao_약수의_합 {

    public static void main(String[] args) {
        Tao_약수의_합 tao = new Tao_약수의_합();

        int n = 12;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
