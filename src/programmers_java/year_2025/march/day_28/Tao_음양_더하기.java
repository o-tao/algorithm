package programmers_java.year_2025.march.day_28;

public class Tao_음양_더하기 {

    public static void main(String[] args) {
        Tao_음양_더하기 tao = new Tao_음양_더하기();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(tao.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}
