package programmers.year_2025.february.day_27;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_배열_만들기_6 {

    public static void main(String[] args) {
        Tao_배열_만들기_6 tao = new Tao_배열_만들기_6();

        int[] arr = {0, 1, 1, 1, 0};

        System.out.println(Arrays.toString(tao.solution(arr)));
    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            if (answer.isEmpty()) {
                answer.add(i);
            } else if (answer.get(answer.size() - 1) == i) {
                answer.remove(answer.size() - 1);
            } else if (answer.get(answer.size() - 1) != i) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
