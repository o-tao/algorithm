package programmers.year_2025_February.day_17;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_n개_간격의_원소들 {

    public static void main(String[] args) {
        Tao_n개_간격의_원소들 answer = new Tao_n개_간격의_원소들();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        System.out.println(Arrays.toString(answer.solution(num_list, n)));
    }

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
