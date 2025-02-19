package programmers.year_2025_February.day_17;


public class Tao_홀수_vs_짝수 {

    public static void main(String[] args) {
        Tao_홀수_vs_짝수 answer = new Tao_홀수_vs_짝수();
        int[] num_list = {4, 2, 6, 1, 7, 6};

        System.out.println(answer.solution(num_list));
    }

    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Math.max(odd, even);
    }
}
