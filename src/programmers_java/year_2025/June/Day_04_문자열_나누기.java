package programmers_java.year_2025.June;

public class Day_04_문자열_나누기 {

    public static void main(String[] args) {
        Day_04_문자열_나누기 tao = new Day_04_문자열_나누기();

        String s = "banana";

        System.out.println(tao.solution(s));
    }

    public int solution(String s) {
        int answer = 0;
        int i = 0;

        while (i < s.length()) {
            char x = s.charAt(i);
            int xCount = 0;
            int otherCount = 0;

            int j = i;
            while (j < s.length()) {
                if (s.charAt(j) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }

                j++;

                if (xCount == otherCount) {
                    break;
                }
            }

            answer++;
            i = j;
        }

        return answer;
    }
}
