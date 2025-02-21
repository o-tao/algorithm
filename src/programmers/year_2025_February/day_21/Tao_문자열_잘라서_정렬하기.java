package programmers.year_2025_February.day_21;

import java.util.Arrays;

public class Tao_문자열_잘라서_정렬하기 {

    public static void main(String[] args) {
        Tao_문자열_잘라서_정렬하기 answer = new Tao_문자열_잘라서_정렬하기();

        String myString = "axbxcxdx";

        System.out.println(Arrays.toString(answer.solution(myString)));
    }

    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(a -> !a.isEmpty()).sorted().toArray(String[]::new);
    }
}
