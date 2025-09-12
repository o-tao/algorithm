package programmers_java.year_2025.June;

import java.util.Arrays;

public class Day_12_바탕화면_정리 {

    public static void main(String[] args) {
        Day_12_바탕화면_정리 tao = new Day_12_바탕화면_정리();

        String[] wallpaper = {".#...", "..#..", "...#."};

        System.out.println(Arrays.toString(tao.solution(wallpaper)));
    }

    public int[] solution(String[] wallpaper) {
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }
}
