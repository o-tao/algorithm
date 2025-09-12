package programmers_java.year_2025.march.day_08;

public class Tao_부분_문자열인지_확인하기 {

    public static void main(String[] args) {
        Tao_부분_문자열인지_확인하기 tao = new Tao_부분_문자열인지_확인하기();

        String my_string = "banana";
        String target = "ana";

        System.out.println(tao.solution(my_string, target));
    }

    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
