package programmers.year_2025.march.day_06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Tao_배열의_원소_삭제하기 {

    public static void main(String[] args) {
        Tao_배열의_원소_삭제하기 tao = new Tao_배열의_원소_삭제하기();

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        System.out.println(Arrays.toString(tao.solution(arr, delete_list)));
    }

    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> IntStream.of(delete_list).noneMatch(j -> j == i)).toArray();
    }
}
