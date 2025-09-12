package programmers_java.year_2025.april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_13_같은_숫자는_싫어 {

    public static void main(String[] args) {
        Day_13_같은_숫자는_싫어 tao = new Day_13_같은_숫자는_싫어();

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(tao.solution(arr)));
    }

    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int prev = -1;
        for (int num : arr) {
            if (num != prev) {
                answer.add(num);
                prev = num;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
