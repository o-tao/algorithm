package programmers.year_2025.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Day_09_명예의_전당_1 {

    public static void main(String[] args) {
        Day_09_명예의_전당_1 tao = new Day_09_명예의_전당_1();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(tao.solution(k, score)));
    }

    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            answer.add(hallOfFame.peek());
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
