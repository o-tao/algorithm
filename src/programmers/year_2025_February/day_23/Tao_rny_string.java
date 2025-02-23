package programmers.year_2025_February.day_23;

public class Tao_rny_string {

    public static void main(String[] args) {
        Tao_rny_string answer = new Tao_rny_string();

        String rny_string = "masterpiece";

        System.out.println(answer.solution(rny_string));
    }

    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
