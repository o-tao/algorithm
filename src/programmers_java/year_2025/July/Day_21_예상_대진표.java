package programmers_java.year_2025.July;

public class Day_21_예상_대진표 {

    public static void main(String[] args) {

        Day_21_예상_대진표 tao = new Day_21_예상_대진표();

        int n = 8;
        int a = 4;
        int b = 7;

        System.out.println(tao.solution(n, a, b));
    }

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
