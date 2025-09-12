package programmers_java.year_2025.april;

public class Day_01_콜라츠_추측 {

    public static void main(String[] args) {
        Day_01_콜라츠_추측 tao = new Day_01_콜라츠_추측();

        int n = 6;

        System.out.println(tao.solution(n));
    }

    public int solution(int num) {
        int answer = 0;
        long n = num;

        while (n != 1) {
            if (answer >= 500) {
                return -1;
            }

            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            answer++;
        }

        return answer;
    }
}
