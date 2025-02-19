package programmers.year_2025_February.day_17;

public class Tao_1로_만들기 {

    public static void main(String[] args) {
        Tao_1로_만들기 answer = new Tao_1로_만들기();

        int[] num_list = {12, 4, 15, 1, 14};

        System.out.println(answer.solution(num_list));
    }

    public int solution(int[] num_list) {
        int answer = 0;

        for (int num : num_list) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else if (num % 2 != 0) {
                    num = (num - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}
