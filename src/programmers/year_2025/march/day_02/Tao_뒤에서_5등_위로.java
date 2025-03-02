package programmers.year_2025.march.day_02;

import java.util.Arrays;

public class Tao_뒤에서_5등_위로 {

    public static void main(String[] args) {
        Tao_뒤에서_5등_위로 tao = new Tao_뒤에서_5등_위로();

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(Arrays.toString(tao.solution(num_list)));
    }

    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}
