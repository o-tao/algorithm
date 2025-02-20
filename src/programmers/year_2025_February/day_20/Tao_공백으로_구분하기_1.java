package programmers.year_2025_February.day_20;

import java.util.Arrays;

public class Tao_공백으로_구분하기_1 {

    public static void main(String[] args) {
        Tao_공백으로_구분하기_1 answer = new Tao_공백으로_구분하기_1();

        String my_string = "i love you";

        System.out.println(Arrays.toString(answer.solution(my_string)));
    }

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
