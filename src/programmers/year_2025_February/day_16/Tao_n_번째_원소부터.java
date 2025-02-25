package programmers.year_2025_February.day_16;


import java.util.ArrayList;
import java.util.Arrays;

public class Tao_n_번째_원소부터 {

    public static void main(String[] args) {
        Tao_n_번째_원소부터 tao = new Tao_n_번째_원소부터();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;

        System.out.println(Arrays.toString(tao.solution(num_list, n)));
    }

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.stream(num_list).forEach(answer::add);

        answer.subList(0, n - 1).clear();
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
