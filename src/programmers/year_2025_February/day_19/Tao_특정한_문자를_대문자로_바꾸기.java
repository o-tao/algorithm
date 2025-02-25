package programmers.year_2025_February.day_19;

public class Tao_특정한_문자를_대문자로_바꾸기 {

    public static void main(String[] args) {
        Tao_특정한_문자를_대문자로_바꾸기 tao = new Tao_특정한_문자를_대문자로_바꾸기();

        String my_string = "programmers";
        String alp = "p";

        System.out.println(tao.solution(my_string, alp));
    }

    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
