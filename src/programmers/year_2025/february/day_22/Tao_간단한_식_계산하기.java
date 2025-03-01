package programmers.year_2025.february.day_22;

public class Tao_간단한_식_계산하기 {

    public static void main(String[] args) {
        Tao_간단한_식_계산하기 tao = new Tao_간단한_식_계산하기();

        String binomial = "43 + 12";

        System.out.println(tao.solution(binomial));
    }

    public int solution(String binomial) {
        int answer = 0;

        String[] parts = binomial.split(" ");
        String op = parts[1];
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> answer;
        };
    }
}
