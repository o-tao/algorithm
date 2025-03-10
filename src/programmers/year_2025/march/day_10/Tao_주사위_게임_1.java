package programmers.year_2025.march.day_10;

public class Tao_주사위_게임_1 {

    public static void main(String[] args) {
        Tao_주사위_게임_1 tao = new Tao_주사위_게임_1();

        int a = 3;
        int b = 5;

        System.out.println(tao.solution(a, b));
    }

    public int solution(int a, int b) {
        if (a % 2 == 1 && b % 2 == 1) {
            return a * a + b * b;

        } else if (a % 2 == 1 || b % 2 == 1) {
            return 2 * (a + b);

        } else {
            return Math.abs(a - b);
        }
    }
}
