package programmers_java.year_2025.september;

import java.util.HashMap;
import java.util.Map;

public class Day_09_할인_행사 {

    public static void main(String[] args) {
        Day_09_할인_행사 tao = new Day_09_할인_행사();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(tao.solution(want, number, discount));
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> windowMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                windowMap.put(discount[j], windowMap.getOrDefault(discount[j], 0) + 1);
            }

            if (isMatch(wantMap, windowMap)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isMatch(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (String key : wantMap.keySet()) {
            if (!windowMap.getOrDefault(key, 0).equals(wantMap.get(key))) {
                return false;
            }
        }
        return true;
    }
}
