package programmers.year_2025_February.day_26;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_빈_배열에_추가_삭제하기 {

    public static void main(String[] args) {
        Tao_빈_배열에_추가_삭제하기 tao = new Tao_빈_배열에_추가_삭제하기();

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(Arrays.toString(tao.solution(arr, flag)));
    }

    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (flag[i]) {
                for (int j = 0; j < num * 2; j++) {
                    answer.add(arr[i]);
                }

            } else {
                for (int j = 0; j < num; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
