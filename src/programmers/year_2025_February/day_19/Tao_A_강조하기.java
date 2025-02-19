package programmers.year_2025_February.day_19;

public class Tao_A_강조하기 {

    public static void main(String[] args) {
        Tao_A_강조하기 answer = new Tao_A_강조하기();

        String myString = "PrOgRaMmErS";

        System.out.println(answer.solution(myString));
    }

    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
