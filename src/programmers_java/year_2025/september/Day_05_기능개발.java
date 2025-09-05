package programmers_java.year_2025.september;

import java.util.*;

public class Day_05_기능개발 {
    public static void main(String[] args) {
        Day_05_기능개발 tao = new Day_05_기능개발();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(tao.solution(progresses, speeds)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int days = (remaining + speeds[i] - 1) / speeds[i];
            queue.offer(days);
        }

        List<Integer> answerList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }

            answerList.add(count);
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
