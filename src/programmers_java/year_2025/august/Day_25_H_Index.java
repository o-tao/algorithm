package programmers_java.year_2025.august;

import java.util.Arrays;

public class Day_25_H_Index {
    public static void main(String[] args) {
        Day_25_H_Index tao = new Day_25_H_Index();

        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(tao.solution(citations));
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int hIndex = n - i;
            if (citations[i] >= hIndex) {
                answer = hIndex;
                break;
            }
        }

        return answer;
    }
}
