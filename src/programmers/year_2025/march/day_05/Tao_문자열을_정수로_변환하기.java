package programmers.year_2025.march.day_05;

public class Tao_문자열을_정수로_변환하기 {

    public static void main(String[] args) {
        Tao_문자열을_정수로_변환하기 tao = new Tao_문자열을_정수로_변환하기();

        String n_str = "10";

        System.out.println(tao.solution(n_str));
    }

    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}
