package programmers_java.year_2025.april;

import java.util.stream.IntStream;

public class Day_17_크기가_작은_부분_문자열 {

    public static void main(String[] args) {
        Day_17_크기가_작은_부분_문자열 tao = new Day_17_크기가_작은_부분_문자열();

        String t = "3141592";
        String p = "271";

        System.out.println(tao.solution(t, p));
    }

    public int solution(String t, String p) {
        return (int) IntStream.rangeClosed(0, t.length() - p.length())
                .mapToObj(i -> t.substring(i, i + p.length()))
                .mapToLong(Long::parseLong)
                .filter(subValue -> subValue <= Long.parseLong(p))
                .count();
    }
}
