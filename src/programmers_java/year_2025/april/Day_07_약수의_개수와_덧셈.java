package programmers_java.year_2025.april;

public class Day_07_약수의_개수와_덧셈 {

    public static void main(String[] args) {
        Day_07_약수의_개수와_덧셈 tao = new Day_07_약수의_개수와_덧셈();

        int left = 13;
        int right = 17;

        System.out.println(tao.solution(left, right));
    }

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }
            answer = count % 2 == 0 ? answer + i : answer - i;
        }

        return answer;
    }
}
