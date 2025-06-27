package programmers.year_2025.June;

import java.util.Stack;

public class Day_27_짝지어_제거하기 {

    public static void main(String[] args) {
        Day_27_짝지어_제거하기 tao = new Day_27_짝지어_제거하기();

        String s = "baabaa";

        System.out.println(tao.solution(s));
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
