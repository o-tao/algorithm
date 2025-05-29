package programmers.year_2025.may;

public class Day_29_1차_다트게임 {

    public static void main(String[] args) {
        Day_29_1차_다트게임 tao = new Day_29_1차_다트게임();

        String dartResult = "1S2D*3T";

        System.out.println(tao.solution(dartResult));
    }

    public int solution(String dartResult) {
        int[] scores = new int[3];
        int index = 0;
        int i = 0;

        while (i < dartResult.length()) {
            int score = 0;

            if (dartResult.charAt(i) == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                score = 10;
                i += 2;
            } else {
                score = dartResult.charAt(i) - '0';
                i++;
            }

            char bonus = dartResult.charAt(i);
            if (bonus == 'S') {
                score = (int) Math.pow(score, 1);
            } else if (bonus == 'D') {
                score = (int) Math.pow(score, 2);
            } else if (bonus == 'T') {
                score = (int) Math.pow(score, 3);
            }
            i++;

            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);
                if (option == '*') {
                    score *= 2;
                    if (index > 0) {
                        scores[index - 1] *= 2;
                    }
                    i++;
                } else if (option == '#') {
                    score *= -1;
                    i++;
                }
            }

            scores[index++] = score;
        }

        return scores[0] + scores[1] + scores[2];
    }
}
