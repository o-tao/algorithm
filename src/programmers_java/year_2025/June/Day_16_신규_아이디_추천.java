package programmers_java.year_2025.June;

public class Day_16_신규_아이디_추천 {

    public static void main(String[] args) {
        Day_16_신규_아이디_추천 tao = new Day_16_신규_아이디_추천();

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        System.out.println(tao.solution(new_id));
    }

    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder(new_id.toLowerCase());
        answer = new StringBuilder(answer.toString().replaceAll("[^a-z0-9-_.]", ""));
        answer = new StringBuilder(answer.toString().replaceAll("\\.{2,}", "."));
        answer = new StringBuilder(answer.toString().replaceAll("^\\.|\\.$", ""));

        if (answer.isEmpty()) {
            answer = new StringBuilder("a");
        }

        if (answer.length() >= 16) {
            answer = new StringBuilder(answer.substring(0, 15));
            answer = new StringBuilder(answer.toString().replaceAll("\\.$", ""));
        }

        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }

        return answer.toString();
    }
}
