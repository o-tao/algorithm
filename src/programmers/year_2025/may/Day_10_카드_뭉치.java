package programmers.year_2025.may;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Day_10_카드_뭉치 {

    public static void main(String[] args) {
        Day_10_카드_뭉치 tao = new Day_10_카드_뭉치();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(tao.solution(cards1, cards2, goal));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String str : goal) {
            if (!queue1.isEmpty() && queue1.peek().equals(str)) {
                queue1.poll();
            } else if (!queue2.isEmpty() && queue2.peek().equals(str)) {
                queue2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }

}
