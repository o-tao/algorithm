package programmers_java.year_2025.may;

import java.util.Arrays;

public class Day_11_1차_비밀지도 {

    public static void main(String[] args) {
        Day_11_1차_비밀지도 tao = new Day_11_1차_비밀지도();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(tao.solution(n, arr1, arr2)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];

            String row = String.format("%" + n + "s", Integer.toBinaryString(combined).replace(' ', '0'));

            row = row.replace('1', '#').replace('0', ' ');

            answer[i] = row;
        }
        return answer;
    }
}
