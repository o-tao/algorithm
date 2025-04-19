package programmers.year_2025.april;

public class Day_19_이상한_문자_만들기 {

    public static void main(String[] args) {
        Day_19_이상한_문자_만들기 tao = new Day_19_이상한_문자_만들기();

        String s = "try hello world";

        System.out.println(tao.solution(s));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        int index = 0;

        for (String str : strArr) {
            index = str.contains(" ") ? 0 : index + 1;
            answer.append(index % 2 == 0 ? str.toUpperCase() : str.toLowerCase());
        }
        return answer.toString();
    }
}
