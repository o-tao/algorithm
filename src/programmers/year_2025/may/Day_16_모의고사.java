package programmers.year_2025.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_16_모의고사 {

    public static void main(String[] args) {
        Day_16_모의고사 tao = new Day_16_모의고사();

        int[] answers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(tao.solution(answers)));
    }

    public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) scores[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) scores[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
