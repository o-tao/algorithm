package programmers_java.year_2025.march.day_01;

public class Tao_문자열_묶기 {

    public static void main(String[] args) {
        Tao_문자열_묶기 tao = new Tao_문자열_묶기();

        String[] strArr = {"a", "bc", "d", "efg", "hi"};

        System.out.println(tao.solution(strArr));
    }

    public int solution(String[] strArr) {
        int answer = 0;
        int[] countArr = new int[30];
        for (String str : strArr) {
            countArr[str.length() - 1]++;
        }

        for (int max : countArr) {
            if (answer < max) {
                answer = max;
            }
        }
        return answer;
    }
}
