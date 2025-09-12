package programmers_java.year_2025.march.day_27;

public class Tao_히샤드_수 {

    public static void main(String[] args) {
        Tao_히샤드_수 tao = new Tao_히샤드_수();

        int x = 10;

        System.out.println(tao.solution(x));
    }

    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
        return x % sum == 0;
    }
}
