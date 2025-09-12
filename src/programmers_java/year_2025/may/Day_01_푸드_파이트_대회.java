package programmers_java.year_2025.may;

import java.util.stream.IntStream;

public class Day_01_푸드_파이트_대회 {

    public static void main(String[] args) {
        Day_01_푸드_파이트_대회 tao = new Day_01_푸드_파이트_대회();

        int[] food = {1, 3, 4, 6};

        System.out.println(tao.solution(food));
    }

    public String solution(int[] food) {
        String left = IntStream.range(1, food.length)
                .mapToObj(i -> String.valueOf(i).repeat(food[i] / 2))
                .reduce("", (a, b) -> a + b);

        String right = new StringBuilder(left).reverse().toString();

        return left + "0" + right;
    }
}
