package programmers.year_2025_February.day_22;

public class Tao_문자열_바꿔서_찾기 {

    public static void main(String[] args) {
        Tao_문자열_바꿔서_찾기 tao = new Tao_문자열_바꿔서_찾기();

        String myString = "ABBAA";
        String pat = "AABB";

        System.out.println(tao.solution(myString, pat));
    }

    public int solution(String myString, String pat) {
        myString = myString.replace("A", "X")
                .replace("B", "A")
                .replace("X", "B");

        return myString.contains(pat) ? 1 : 0;
    }
}
