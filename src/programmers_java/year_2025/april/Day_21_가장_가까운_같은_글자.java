package programmers_java.year_2025.april;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Day_21_가장_가까운_같은_글자 {

    public static void main(String[] args) {
        Day_21_가장_가까운_같은_글자 tao = new Day_21_가장_가까운_같은_글자();

        String s = "banana";

        System.out.println(Arrays.toString(tao.solution(s)));
    }

    public int[] solution(String s) {
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        return IntStream.range(0, s.length())
                .map(i -> {
                    char c = s.charAt(i);
                    int result = lastIndexMap.containsKey(c) ? i - lastIndexMap.get(c) : -1;
                    lastIndexMap.put(c, i);
                    return result;
                }).toArray();
    }
}
