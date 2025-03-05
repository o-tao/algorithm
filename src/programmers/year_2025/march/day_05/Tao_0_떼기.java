package programmers.year_2025.march.day_05;

public class Tao_0_떼기 {

    public static void main(String[] args) {
        Tao_0_떼기 tao = new Tao_0_떼기();

        String n_str = "0010";

        System.out.println(tao.solution(n_str));
    }

    public String solution(String n_str) {
        return Integer.parseInt(n_str) + "";
    }
}
