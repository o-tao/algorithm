package programmers_java.year_2025.april;

import java.util.stream.IntStream;

public class Day_18_삼총사 {

    public static void main(String[] args) {
        Day_18_삼총사 tao = new Day_18_삼총사();

        int[] number = {-2, 3, 0, 2, -5};

        System.out.println(tao.solution(number));
    }

    public int solution(int[] number) {
        int n = number.length;

        return (int) IntStream.range(0, n - 2)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, n - 1)
                        .boxed()
                        .flatMap(j -> IntStream.range(j + 1, n)
                                .filter(k -> number[i] + number[j] + number[k] == 0)
                                .boxed()
                        )
                )
                .count();
    }
}
