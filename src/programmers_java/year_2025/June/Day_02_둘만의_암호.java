package programmers_java.year_2025.June;

import java.util.HashSet;
import java.util.Set;

public class Day_02_둘만의_암호 {

    public static void main(String[] args) {
        Day_02_둘만의_암호 tao = new Day_02_둘만의_암호();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(tao.solution(s, skip, index));
    }

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();

        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (char ch : s.toCharArray()) {
            int count = 0;
            char current = ch;

            while (count < index) {
                current++;

                if (current > 'z') current = 'a';

                if (!skipSet.contains(current)) count++;
            }

            answer.append(current);
        }

        return answer.toString();
    }
}
