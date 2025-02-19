package programmers.year_2025_February.day_19;

public class Tao_원하는_문자열_찾기 {

    public static void main(String[] args) {
        Tao_원하는_문자열_찾기 answer = new Tao_원하는_문자열_찾기();

        String myString = "AbCdEfG";
        String pat = "aBc";

        System.out.println(answer.solution(myString, pat));
    }

    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
