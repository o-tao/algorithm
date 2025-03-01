package programmers.year_2025.february.day_19;

public class Tao_원하는_문자열_찾기 {

    public static void main(String[] args) {
        Tao_원하는_문자열_찾기 tao = new Tao_원하는_문자열_찾기();

        String myString = "AbCdEfG";
        String pat = "aBc";

        System.out.println(tao.solution(myString, pat));
    }

    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
