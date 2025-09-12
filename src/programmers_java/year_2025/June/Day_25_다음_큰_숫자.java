package programmers_java.year_2025.June;

public class Day_25_다음_큰_숫자 {

    public static void main(String[] args) {
        Day_25_다음_큰_숫자 tao = new Day_25_다음_큰_숫자();

        int n = 78;

        System.out.println(tao.solution(n));
    }

    public int solution(int n) {
        int count = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == count) {
                return n;
            }
        }
    }
}
