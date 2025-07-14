package programmers.year_2025.July;

import java.util.*;

public class Day_14_귤_고르기 {

    public static void main(String[] args) {
        Day_14_귤_고르기 tao = new Day_14_귤_고르기();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(tao.solution(k, tangerine));
    }

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());

        int sum = 0;
        int answer = 0;
        for (int count : counts) {
            sum += count;
            answer++;
            if (sum >= k) break;
        }

        return answer;
    }
}
