package programmers_java.year_2025.July;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day_17_영어_끝말잇기 {

    public static void main(String[] args) {
        Day_17_영어_끝말잇기 tao = new Day_17_영어_끝말잇기();

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println(Arrays.toString(tao.solution(n, words)));
    }

    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        used.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < 2) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            String prev = words[i - 1];
            String curr = words[i];
            if (used.contains(curr) || prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            used.add(curr);
        }

        return new int[]{0, 0};
    }
}
