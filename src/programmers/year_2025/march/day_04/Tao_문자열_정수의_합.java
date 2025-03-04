package programmers.year_2025.march.day_04;

public class Tao_문자열_정수의_합 {

    public static void main(String[] args) {
        Tao_문자열_정수의_합 tao = new Tao_문자열_정수의_합();

        String num_str = "123456789";

        System.out.println(tao.solution(num_str));
    }

    public int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            int num = Integer.parseInt(num_str.substring(i, i + 1));
            answer += num;
        }
        return answer;
    }
}
