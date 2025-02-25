package programmers.year_2025_February.day_17;


public class Tao_n보다_커질_때까지_더하기 {

    public static void main(String[] args) {
        Tao_n보다_커질_때까지_더하기 tao = new Tao_n보다_커질_때까지_더하기();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        System.out.println(tao.solution(numbers, n));
    }

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }
        return answer;
    }
}
