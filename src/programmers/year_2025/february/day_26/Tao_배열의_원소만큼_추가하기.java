package programmers.year_2025.february.day_26;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_배열의_원소만큼_추가하기 {

    public static void main(String[] args) {
        Tao_배열의_원소만큼_추가하기 tao = new Tao_배열의_원소만큼_추가하기();

        int[] arr = {5, 1, 4};

        System.out.println(Arrays.toString(tao.solution(arr)));
    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
