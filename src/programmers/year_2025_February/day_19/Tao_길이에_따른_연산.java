package programmers.year_2025_February.day_19;

public class Tao_길이에_따른_연산 {

    public static void main(String[] args) {
        Tao_길이에_따른_연산 answer = new Tao_길이에_따른_연산();

        int[] num_list = {2, 3, 4, 5};

        System.out.println(answer.solution(num_list));
    }

    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                answer += num_list[i];

            } else if (num_list.length <= 10) {
                answer *= num_list[i];
            }
        }
        return answer;
    }

}
