package programmers_java.year_2025.april;

import java.util.Arrays;

public class Day_04_제일_작은_수_제거하기 {

    public static void main(String[] args) {
        Day_04_제일_작은_수_제거하기 tao = new Day_04_제일_작은_수_제거하기();

        int[] arr = {4, 3, 2, 1};

        System.out.println(Arrays.toString(tao.solution(arr)));
    }

    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int[] answer = Arrays.stream(arr).filter(i -> i != min).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
