package programmers.year_2024_December.day_11;

public class Tao_문자열뒤집기 {
    public static void main(String[] args) {
        Tao_문자열뒤집기 a = new Tao_문자열뒤집기();
        String my_string = "jaron";

        System.out.println(a.solution(my_string));
    }

    public String solution(String my_string) {
        StringBuffer stringBuffer = new StringBuffer(my_string);
        String answer = String.valueOf(stringBuffer.reverse());

        return answer;
    }
}
