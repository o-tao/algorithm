package programmers.year_2025.february.day_19;

public class Tao_문자열이_몇_번_등장하는지_세기 {

    public static void main(String[] args) {
        Tao_문자열이_몇_번_등장하는지_세기 tao = new Tao_문자열이_몇_번_등장하는지_세기();

        String myString = "banana";
        String pat = "ana";

        System.out.println(tao.solution(myString, pat));
    }

    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.startsWith(pat, i)) {
                answer++;
            }
        }
        return answer;
    }
}
