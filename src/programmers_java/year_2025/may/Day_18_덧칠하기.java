package programmers_java.year_2025.may;

public class Day_18_덧칠하기 {

    public static void main(String[] args) {
        Day_18_덧칠하기 tao = new Day_18_덧칠하기();

        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        System.out.println(tao.solution(n, m, section));
    }

    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int position = 1;

        for (int i : section) {
            if (position <= i) {
                answer++;
                position = i + m;
            }
        }
        return answer;
    }
}
