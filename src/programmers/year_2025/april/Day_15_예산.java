package programmers.year_2025.april;

import java.util.Arrays;

public class Day_15_예산 {

    public static void main(String[] args) {
        Day_15_예산 tao = new Day_15_예산();

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        System.out.println(tao.solution(d, budget));
    }

    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int count = 0;
        int sum = 0;

        for (int j : d) {
            sum += j;
            if (sum <= budget) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
