package programmers.year_2025.march.day_08;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tao_꼬리_문자열 {

    public static void main(String[] args) {
        Tao_꼬리_문자열 tao = new Tao_꼬리_문자열();

        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        System.out.println(tao.solution(str_list, ex));
    }

    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(str -> !str.contains(ex)).collect(Collectors.joining());
    }
}
