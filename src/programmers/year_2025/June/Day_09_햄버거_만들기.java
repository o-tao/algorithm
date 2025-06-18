package programmers.year_2025.June;

import java.util.Stack;

public class Day_09_햄버거_만들기 {

    public static void main(String[] args) {
        Day_09_햄버거_만들기 tao = new Day_09_햄버거_만들기();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(tao.solution(ingredient));
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int ing : ingredient) {
            stack.push(ing);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}
