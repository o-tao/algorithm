package programmers.year_2025.july;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_01_로또의_최고_순위와_최저_순위 {

    public static void main(String[] args) {
        Day_01_로또의_최고_순위와_최저_순위 tao = new Day_01_로또의_최고_순위와_최저_순위();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(tao.solution(lottos, win_nums)));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        long zeroCount = Arrays.stream(lottos)
                .filter(n -> n == 0)
                .count();

        Set<Integer> winSet = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toSet());

        long matchCount = Arrays.stream(lottos)
                .filter(n -> n != 0 && winSet.contains(n))
                .count();

        int maxMatch = (int)(matchCount + zeroCount);
        int minMatch = (int)matchCount;

        int maxRank = maxMatch >= 2 ? 7 - maxMatch : 6;
        int minRank = minMatch >= 2 ? 7 - minMatch : 6;

        return new int[] { maxRank, minRank };
    }
}
