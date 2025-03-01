package programmers.year_2025.february.day_16;

import java.util.Arrays;

public class Tao_n_번째_원소까지 {

    public static void main(String[] args) {
        Tao_n_번째_원소까지 tao = new Tao_n_번째_원소까지();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        System.out.println(Arrays.toString(tao.solution(num_list, n)));
    }

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
