package programmers_java.year_2025.may;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day_12_추억_점수 {

    public static void main(String[] args) {
        Day_12_추억_점수 tao = new Day_12_추억_점수();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(tao.solution(name, yearning, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = IntStream.range(0, name.length)
                .boxed()
                .collect(Collectors.toMap(i -> name[i], i -> yearning[i]));

        return Arrays.stream(photo)
                .mapToInt(p -> Arrays.stream(p)
                        .mapToInt(person -> map.getOrDefault(person, 0))
                        .sum()
                )
                .toArray();
    }

}
