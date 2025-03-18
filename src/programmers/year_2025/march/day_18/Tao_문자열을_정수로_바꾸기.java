package programmers.year_2025.march.day_18;

public class Tao_문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        Tao_문자열을_정수로_바꾸기 tao = new Tao_문자열을_정수로_바꾸기();

        String s = "1234";

        System.out.println(tao.solution(s));
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
