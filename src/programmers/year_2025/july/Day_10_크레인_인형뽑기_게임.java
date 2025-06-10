package programmers.year_2025.july;

import java.util.Stack;

public class Day_10_크레인_인형뽑기_게임 {

    public static void main(String[] args) {
        Day_10_크레인_인형뽑기_게임 tao = new Day_10_크레인_인형뽑기_게임();

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(tao.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            int col = move - 1;

            for (int row = 0; row < board.length; row++) {
                int doll = board[row][col];
                if (doll != 0) {
                    board[row][col] = 0;
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
