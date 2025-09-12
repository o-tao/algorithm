package programmers_java.year_2025.april;

import java.util.stream.IntStream;

public class Day_05_내적 {

    public static void main(String[] args) {
        Day_05_내적 tao = new Day_05_내적();

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        System.out.println(tao.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }
}
