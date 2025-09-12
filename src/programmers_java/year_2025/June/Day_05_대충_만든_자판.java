package programmers_java.year_2025.June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day_05_대충_만든_자판 {

    public static void main(String[] args) {
        Day_05_대충_만든_자판 tao = new Day_05_대충_만든_자판();

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(Arrays.toString(tao.solution(keymap, targets)));
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char c = keys.charAt(i);
                int pressCount = i + 1;
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), pressCount));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;
            boolean canType = true;

            for (char c : target.toCharArray()) {
                if (!map.containsKey(c)) {
                    canType = false;
                    break;
                }
                totalPress += map.get(c);
            }

            answer[i] = canType ? totalPress : -1;
        }

        return answer;
    }
}
