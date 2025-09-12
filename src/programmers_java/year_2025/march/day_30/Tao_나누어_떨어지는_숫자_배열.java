package programmers_java.year_2025.march.day_30;

import java.util.Arrays;
import java.util.List;

public class Tao_나누어_떨어지는_숫자_배열 {

    public static void main(String[] args) {
        Tao_나누어_떨어지는_숫자_배열 tao = new Tao_나누어_떨어지는_숫자_배열();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(tao.solution(arr, divisor)));
    }

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .boxed()
                .toList();

        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}
