package programmers.year_2025.february.day_16;

import java.util.Arrays;

public class Tao_왼쪽_오른쪽 {

    public static void main(String[] args) {
        Tao_왼쪽_오른쪽 tao = new Tao_왼쪽_오른쪽();
        String[] str_list = {"u", "u", "l"};

        System.out.println(Arrays.toString(tao.solution(str_list)));
    }

    public String[] solution(String[] str_list) {
        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);

            } else if (str_list[i].equals("r")) {
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);

            }
        }
        return answer;
    }
}
