package programmers_java.year_2025.march.day_31;

import java.util.Arrays;

public class Tao_서울에서_김서방_찾기 {

    public static void main(String[] args) {
        Tao_서울에서_김서방_찾기 tao = new Tao_서울에서_김서방_찾기();

        String[] seoul = {"Jane", "Kim"};

        System.out.println(tao.solution(seoul));
    }

    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
}
