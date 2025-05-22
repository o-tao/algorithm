package programmers.year_2025.may;

public class Day_22_옹알이_2 {

    public static void main(String[] args) {
        Day_22_옹알이_2 tao = new Day_22_옹알이_2();

        String[] babbling = {"aya", "yee", "u", "maa"};

        System.out.println(tao.solution(babbling));
    }

    public int solution(String[] babbling) {
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;
            String prev = "";

            boolean isValid = true;

            while (!temp.isEmpty()) {
                boolean matched = false;

                for (String p : pronunciations) {
                    if (temp.startsWith(p) && !p.equals(prev)) {
                        temp = temp.substring(p.length());
                        prev = p;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}
