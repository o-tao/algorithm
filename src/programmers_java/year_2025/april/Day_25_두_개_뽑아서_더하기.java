package programmers_java.year_2025.april;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day_25_두_개_뽑아서_더하기 {

    public static void main(String[] args) {
        Day_25_두_개_뽑아서_더하기 tao = new Day_25_두_개_뽑아서_더하기();

        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(tao.solution(numbers)));
    }

    public int[] solution(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, numbers.length)
                        .mapToObj(j -> numbers[i] + numbers[j]))
                .collect(Collectors.toSet())
                .stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
