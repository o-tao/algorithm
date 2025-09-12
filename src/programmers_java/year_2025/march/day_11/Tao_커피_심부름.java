package programmers_java.year_2025.march.day_11;

import java.util.Arrays;

public class Tao_커피_심부름 {

    public static void main(String[] args) {
        Tao_커피_심부름 tao = new Tao_커피_심부름();

        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        System.out.println(tao.solution(order));
    }

    public int solution(String[] order) {
        return Arrays.stream(order).mapToInt(item -> item.contains("cafelatte") ? 5000 : 4500).sum();
    }
}
