package programmers_java.year_2025.march.day_09;

import java.util.Arrays;

public class Tao_정수_찾기 {

    public static void main(String[] args) {
        Tao_정수_찾기 tao = new Tao_정수_찾기();

        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        System.out.println(tao.solution(num_list, n));
    }

    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }
}
