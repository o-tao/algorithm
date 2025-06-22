package programmers.year_2025.June;

import java.util.Arrays;

public class Day_22_이진_변환_반복하기 {

    public static void main(String[] args) {
        Day_22_이진_변환_반복하기 tao = new Day_22_이진_변환_반복하기();

        String s = "110010101001";

        System.out.println(Arrays.toString(tao.solution(s)));
    }

    public int[] solution(String s) {
        int answer = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replace("0", "");
            int afterLength = s.length();

            zeroCount += (beforeLength - afterLength);

            s = Integer.toBinaryString(afterLength);
            answer++;
        }

        return new int[] {answer, zeroCount};
    }
}
