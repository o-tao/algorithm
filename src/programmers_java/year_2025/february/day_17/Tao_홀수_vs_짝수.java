package programmers_java.year_2025.february.day_17;


public class Tao_홀수_vs_짝수 {

    public static void main(String[] args) {
        Tao_홀수_vs_짝수 tao = new Tao_홀수_vs_짝수();
        int[] num_list = {4, 2, 6, 1, 7, 6};

        System.out.println(tao.solution(num_list));
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
