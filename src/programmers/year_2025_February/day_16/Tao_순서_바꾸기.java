package programmers.year_2025_February.day_16;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_순서_바꾸기 {

    public static void main(String[] args) {
        Tao_순서_바꾸기 answer = new Tao_순서_바꾸기();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        System.out.println(Arrays.toString(answer.solution(num_list, n)));
    }

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);

        for(int i = 0; i < a.length; i++) {
            answer.add(a[i]);
        }

        for(int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
