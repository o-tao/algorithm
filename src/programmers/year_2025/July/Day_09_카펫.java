package programmers.year_2025.July;

import java.util.Arrays;

public class Day_09_카펫 {

    public static void main(String[] args) {
        Day_09_카펫 tao = new Day_09_카펫();

        int brown = 10;
        int yellow = 2;

        System.out.println(Arrays.toString(tao.solution(brown, yellow)));
    }

    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {
            int width = total / height;

            if (total % height == 0 && width >= height) {
                int innerWidth = width - 2;
                int innerHeight = height - 2;
                int yellowArea = innerWidth * innerHeight;

                if (yellowArea == yellow) {
                    return new int[]{width, height};
                }
            }
        }

        return new int[]{0, 0};
    }
}
