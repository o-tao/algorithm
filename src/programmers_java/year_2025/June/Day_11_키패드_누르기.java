package programmers_java.year_2025.June;

public class Day_11_키패드_누르기 {

    public static void main(String[] args) {
        Day_11_키패드_누르기 tao = new Day_11_키패드_누르기();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.println(tao.solution(numbers, hand));
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int[][] position = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};

        int[] left = {3, 0};
        int[] right = {3, 2};

        for (int number : numbers) {
            int[] target = position[number];

            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = target;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = target;
            } else {
                int leftDist = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightDist = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    left = target;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    right = target;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        right = target;
                    } else {
                        answer.append("L");
                        left = target;
                    }
                }
            }
        }

        return answer.toString();
    }
}
