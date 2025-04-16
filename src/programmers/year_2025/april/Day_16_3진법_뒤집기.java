package programmers.year_2025.april;

public class Day_16_3진법_뒤집기 {

    public static void main(String[] args) {
        Day_16_3진법_뒤집기 tao = new Day_16_3진법_뒤집기();

        int n = 45;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        String base3 = Integer.toString(n, 3);
        String reversed = new StringBuilder(base3).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}
