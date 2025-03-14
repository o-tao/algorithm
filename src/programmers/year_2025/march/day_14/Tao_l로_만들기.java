package programmers.year_2025.march.day_14;

public class Tao_l로_만들기 {

    public static void main(String[] args) {
        Tao_l로_만들기 tao = new Tao_l로_만들기();

        String myString = "abcdevwxyz";

        System.out.println(tao.solution(myString));
    }

    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}
