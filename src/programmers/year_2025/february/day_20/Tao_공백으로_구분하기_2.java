package programmers.year_2025.february.day_20;

import java.util.Arrays;

public class Tao_공백으로_구분하기_2 {

    public static void main(String[] args) {
        Tao_공백으로_구분하기_2 tao = new Tao_공백으로_구분하기_2();

        String my_string = "i  love  you";

        System.out.println(Arrays.toString(tao.solution(my_string)));
    }

    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
