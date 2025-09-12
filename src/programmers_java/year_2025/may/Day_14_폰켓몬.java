package programmers_java.year_2025.may;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_14_폰켓몬 {

    public static void main(String[] args) {
        Day_14_폰켓몬 tao = new Day_14_폰켓몬();

        int[] nums = {3, 1, 2, 3};

        System.out.println(tao.solution(nums));
    }

    public int solution(int[] nums) {
        int pick = nums.length / 2;

        Set<Integer> uniqueTypes = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        return Math.min(uniqueTypes.size(), pick);
    }
}
