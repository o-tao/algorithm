package programmers.year_2025_February.day_19;

import java.util.Arrays;

public class Tao_배열에서_문자열_대소문자_변환하기 {

    public static void main(String[] args) {
        Tao_배열에서_문자열_대소문자_변환하기 answer = new Tao_배열에서_문자열_대소문자_변환하기();

        String[] strArr = {"AAA","BBB","CCC","DDD"};

        System.out.println(Arrays.toString(answer.solution(strArr)));
    }

    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else if (i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}
