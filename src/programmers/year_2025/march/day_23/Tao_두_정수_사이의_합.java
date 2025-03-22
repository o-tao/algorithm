package programmers.year_2025.march.day_23;

import java.util.stream.LongStream;

public class Tao_두_정수_사이의_합 {

    public static void main(String[] args) {
        Tao_두_정수_사이의_합 tao = new Tao_두_정수_사이의_합();

        int a = 3, b = 5;

        System.out.println(tao.solution(a, b));
    }

    public long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
