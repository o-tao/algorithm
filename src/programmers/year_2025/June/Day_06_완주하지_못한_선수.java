package programmers.year_2025.June;

import java.util.HashMap;
import java.util.Map;

public class Day_06_완주하지_못한_선수 {

    public static void main(String[] args) {
        Day_06_완주하지_못한_선수 tao = new Day_06_완주하지_못한_선수();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(tao.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return "";
    }
}
