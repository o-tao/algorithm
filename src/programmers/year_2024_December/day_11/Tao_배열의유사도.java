package programmers.year_2024_December.day_11;

public class Tao_배열의유사도 {

    public static void main(String[] args) {
        Tao_배열의유사도 a = new Tao_배열의유사도();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(a.solution(s1, s2));
    }

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
