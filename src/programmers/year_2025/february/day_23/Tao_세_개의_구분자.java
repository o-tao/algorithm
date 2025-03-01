package programmers.year_2025.february.day_23;

import java.util.Arrays;

public class Tao_세_개의_구분자 {

    public static void main(String[] args) {
        Tao_세_개의_구분자 tao = new Tao_세_개의_구분자();

        String myStr = "baconlettucetomato";

        System.out.println(Arrays.toString(tao.solution(myStr)));
    }

    public String[] solution(String myStr) {
        String replace = myStr.replaceAll("[a-c]", " ");
        return replace.isBlank() ? new String[]{"EMPTY"} : replace.trim().split("\\s+");
    }
}
