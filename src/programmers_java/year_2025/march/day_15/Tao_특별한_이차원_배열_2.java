package programmers_java.year_2025.march.day_15;

public class Tao_특별한_이차원_배열_2 {

    public static void main(String[] args) {
        Tao_특별한_이차원_배열_2 tao = new Tao_특별한_이차원_배열_2();

        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};

        System.out.println(tao.solution(arr));
    }

    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
