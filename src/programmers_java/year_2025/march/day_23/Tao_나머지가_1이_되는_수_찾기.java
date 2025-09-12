package programmers_java.year_2025.march.day_23;

import java.util.stream.IntStream;

public class Tao_나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {
        Tao_나머지가_1이_되는_수_찾기 tao = new Tao_나머지가_1이_되는_수_찾기();

        int n = 10;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 1).min().orElse(0);
    }
}
