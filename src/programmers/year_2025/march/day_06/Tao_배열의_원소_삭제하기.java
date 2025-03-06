package programmers.year_2025.march.day_06;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Tao_배열의_원소_삭제하기 {

    public static void main(String[] args) {
        Tao_배열의_원소_삭제하기 tao = new Tao_배열의_원소_삭제하기();

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        System.out.println(Arrays.toString(tao.solution(arr, delete_list)));
    }

    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(arr)
                .filter(i -> !deleteSet.contains(i))
                .toArray();
    }
}
