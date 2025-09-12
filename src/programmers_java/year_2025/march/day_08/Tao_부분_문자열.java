package programmers_java.year_2025.march.day_08;

public class Tao_부분_문자열 {

    public static void main(String[] args) {
        Tao_부분_문자열 tao = new Tao_부분_문자열();

        String str1 = "abc";
        String str2 = "aabcc";

        System.out.println(tao.solution(str1, str2));
    }

    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
