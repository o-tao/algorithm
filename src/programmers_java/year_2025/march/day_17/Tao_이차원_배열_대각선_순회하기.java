package programmers_java.year_2025.march.day_17;

public class Tao_이차원_배열_대각선_순회하기 {

    public static void main(String[] args) {
        Tao_이차원_배열_대각선_순회하기 tao = new Tao_이차원_배열_대각선_순회하기();

        int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        int k = 2;

        System.out.println(tao.solution(board, k));
    }

    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
