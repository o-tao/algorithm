package programmers.year_2025.february.day_19;

public class Tao_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

    public static void main(String[] args) {
        Tao_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 tao = new Tao_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기();

        String myString = "AbCdEFG";
        String alp = "dE";

        System.out.println(tao.solution(myString, alp));
    }

    public String solution(String myString, String alp) {
        return myString.substring(0, myString.lastIndexOf(alp) + alp.length());
    }
}
