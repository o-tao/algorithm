package programmers.year_2025.June;

import java.util.*;

public class Day_15_데이터_분석 {

    public static void main(String[] args) {
        Day_15_데이터_분석 tao = new Day_15_데이터_분석();

        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        System.out.println(Arrays.deepToString(tao.solution(data, ext, val_ext, sort_by)));
    }

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> fieldIndex = new HashMap<>();
        fieldIndex.put("code", 0);
        fieldIndex.put("date", 1);
        fieldIndex.put("maximum", 2);
        fieldIndex.put("remain", 3);

        int extIndex = fieldIndex.get(ext);
        int sortIndex = fieldIndex.get(sort_by);

        List<int[]> filtered = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filtered.add(row);
            }
        }

        filtered.sort(Comparator.comparingInt(row -> row[sortIndex]));

        int[][] answer = new int[filtered.size()][4];
        for (int i = 0; i < filtered.size(); i++) {
            answer[i] = filtered.get(i);
        }

        return answer;
    }
}
