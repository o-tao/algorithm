package programmers.year_2025.march.day_03;

import java.util.Arrays;

public class Tao_전국_대회_선발_고사 {

    public static void main(String[] args) {
        Tao_전국_대회_선발_고사 tao = new Tao_전국_대회_선발_고사();

        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};

        System.out.println(tao.solution(rank, attendance));
    }

    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[rank.length];

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                temp[i] = rank[i];

            } else {
                rank[i] = Integer.MAX_VALUE;
            }

        }

        Arrays.sort(rank);

        for (int i = 0; i < temp.length; i++) {
            if (rank[0] == temp[i]) {
                answer += i * 10000;

            } else if (rank[1] == temp[i]) {
                answer += i * 100;

            } else if (rank[2] == temp[i]) {
                answer += i;
            }
        }
        return answer;
    }

}
