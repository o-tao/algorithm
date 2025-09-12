package programmers_java.year_2025.february.day_20;

import java.util.Arrays;

public class Tao_공백으로_구분하기_1 {

    public static void main(String[] args) {
        Tao_공백으로_구분하기_1 tao = new Tao_공백으로_구분하기_1();

        String my_string = "i love you";

        System.out.println(Arrays.toString(tao.solution(my_string)));
    }

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
