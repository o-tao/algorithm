package programmers_java.year_2025.february.day_27;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_무작위로_K개의_수_뽑기 {

    public static void main(String[] args) {
        Tao_무작위로_K개의_수_뽑기 tao = new Tao_무작위로_K개의_수_뽑기();

        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;

        System.out.println(Arrays.toString(tao.solution(arr, k)));
    }

    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.size() == k) {
                break;
            } else if (!answer.contains(arr[i])) {
                answer.add(arr[i]);
            }
        }

        while (answer.size() < k) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
