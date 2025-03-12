package programmers.year_2025.march.day_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Tao_그림_확대 {

    public static void main(String[] args) {
        Tao_그림_확대 tao = new Tao_그림_확대();

        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;

        System.out.println(Arrays.toString(tao.solution(picture, k)));
    }

    public String[] solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<>();

        for (String row : picture) {
            StringBuilder sb = new StringBuilder();

            for (char c : row.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }

            String str = sb.toString();
            for (int i = 0; i < k; i++) {
                answer.add(str);
            }
        }

        return answer.toArray(new String[0]);
    }
}
