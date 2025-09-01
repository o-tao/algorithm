package programmers_java.year_2025.september;

import java.util.HashMap;
import java.util.Map;

public class Day_01_의상 {
    public static void main(String[] args) {
        Day_01_의상 tao = new Day_01_의상();

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(tao.solution(clothes));
    }

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }
}
