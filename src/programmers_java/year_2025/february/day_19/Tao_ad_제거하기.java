package programmers_java.year_2025.february.day_19;

import java.util.Arrays;

public class Tao_ad_제거하기 {

    public static void main(String[] args) {
        Tao_ad_제거하기 tao = new Tao_ad_제거하기();

        String[] strArr = {"and", "notad", "abcd"};

        System.out.println(Arrays.toString(tao.solution(strArr)));
    }

    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(a -> !a.contains("ad")).toArray(String[]::new);
    }
}
